package com.revature.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.Customer;

import util.ConnectionFactory;

public class CustomerDao implements DAO<Customer>{

	@Override
	public ArrayList<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getInstanceByField(Customer newInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addInstance(Customer newInstance) {
		try(Connection connection = ConnectionFactory.getInstance().getConnection()){
			String query = "insert into customers (customer_name, email) values (?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(query); //conevert to prepared statement
			pstmt.setString(1, newInstance.getName());
			pstmt.setString(2, newInstance.getEmail());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong");
			//e.printStackTrace();
		}
	}

}
