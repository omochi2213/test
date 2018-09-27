package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO log=new LoginDTO();
		String sql="select * from login_user_transaction where login_id=? and login_pass=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				log.setLoginId(rs.getString("login_id"));
				log.setLoginPassword(rs.getString("login_pass"));
				log.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))){
					log.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return log;
	}

}
