package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {
	public BuyItemDTO getBuyItemInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		BuyItemDTO buy=new BuyItemDTO();
		String sql="select id,item_name,item_price  from item_info_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				buy.setId(rs.getInt("id"));
				buy.setItemName(rs.getString("item_name"));
				buy.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buy;

	};

}
