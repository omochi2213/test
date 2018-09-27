package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String deleteFlg;
	private String result;
	public String execute()throws SQLException{
		MyPageDAO mpdao=new MyPageDAO();
		MyPageDTO mpdto=new MyPageDTO();
		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();

			mpdto=mpdao.getMyPageUserInfo(item_transaction_id, user_master_id);
			session.put("buyItem_name", mpdto.getItemName());
			session.put("total_price",mpdto.getTotalPrice());
			session.put("total_count",mpdto.getTotalCount());
			session.put("total_payment",mpdto.getPayment());
			session.put("message","");
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result =SUCCESS;
		return result;
	}
	public void delete()throws SQLException{
		MyPageDAO mpdao=new MyPageDAO();
		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		int res=mpdao.buyItemHistoryDelete(item_transaction_id,user_master_id);
		if(res>0){
			session.put("message","商品情報を正しく削除しました。");
		}else if(res==0){
			session.put("message","商品情報の削除に失敗しました。");
		}
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
