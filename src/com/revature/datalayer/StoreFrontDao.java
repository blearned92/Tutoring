package com.revature.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.StoreFront;

import util.ConnectionFactory;

public class StoreFrontDao implements DAO<StoreFront>{

	@Override
	public ArrayList<StoreFront> getAll() {
		ArrayList<StoreFront> storeFronts = new ArrayList<>();
		
		try(Connection connection = ConnectionFactory.getInstance().getConnection()){
			String query = "select *  from storefronts";
			PreparedStatement pstmt = connection.prepareStatement(query); //conevert to prepared statement
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				storeFronts.add(new StoreFront(rs.getInt("store_id"), rs.getString("storefront_name"), rs.getString("address")));
			}	
			return storeFronts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong");
			//e.printStackTrace();
		}
		return storeFronts;
	}

	@Override
	public StoreFront getInstanceByField(StoreFront newInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addInstance(StoreFront newInstance) {
		// TODO Auto-generated method stub
		
	}

}
