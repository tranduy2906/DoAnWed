package dao;

import entity.Content;
import entity.Member;
import context.DBContext;
import entity.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
public class DaoRegister {
	
	Connection conn = null;	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public static void main(String[] args) {
		DaoRegister da = new DaoRegister();
		String a= "truong";
		String b="nam";
		customer cus = da.checkEmployeeExist(a, b);
		
		System.out.print(cus.getName());
	}
	
	
	public customer checkEmployeeExist(String name, String gender ) {
		String query = "select * from employee.infor where name = "+"?"
					+"and gender = "+"?";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, gender);
			rs = ps.executeQuery();
			
			
			while(rs.next()) {	
				String name1 = rs.getString(2);
				String gender2 = rs.getString(3);
				String date = rs.getString(4);
				String part = rs.getString(5);
				
				return new customer(name1,gender2,date,part);
			}	
		}
		catch(Exception e) {
			
		}
		return null;
	}
	
	public void register(String username, String email, String password) {
		String query = "insert into member(UserName,Email,Password) values (?,?,?)";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.executeUpdate();
		}
		catch(Exception e) {
		}
		
	}
	
	public Member checkMemberExist(String usernamein, String emailin ) {
		String query = "select * from infor where UserName ="+"?"+
				"and Email ="+"?";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, usernamein);
			ps.setString(2, emailin);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String username = rs.getString(4);
				String email = rs.getString(5);
				String password = rs.getString(6);
				String phone = rs.getString(7);
				String description = rs.getString(8);
				String createdate = rs.getString(9);
				String updatetime = rs.getString(10);
				
				return new Member(id,firstname,lastname,username,email,password,phone,description,createdate,updatetime);
			}
		}
		catch(Exception e) {
		}
		return null;
	}

}

