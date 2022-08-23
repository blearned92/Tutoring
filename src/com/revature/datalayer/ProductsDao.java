package com.revature.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.Product;
import com.revature.models.StoreFront;

import util.ConnectionFactory;

public class ProductsDao implements DAO<Product>{

	@Override
	public ArrayList<Product> getAll() {
		ArrayList<Product> products = new ArrayList<>();
		
		try(Connection connection = ConnectionFactory.getInstance().getConnection()){
			String query = "select * from products";
			PreparedStatement pstmt = connection.prepareStatement(query); //conevert to prepared statement
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				products.add(new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("price")));
			}	
			return products;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong");
			//e.printStackTrace();
		}
		return products;
	}

	@Override
	public Product getInstanceByField(Product newInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addInstance(Product newInstance) {
		// TODO Auto-generated method stub
		
	}

}
