package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Postgre_test {

	public static void main(String[] args) {
		 String url = "jdbc:postgresql://localhost:5432/postgres";
		 String user = "postgres";
		 String password = "sabo0202";
		 
		 try(Connection conn = DriverManager.getConnection(url,user,password)) {
			 
	            String sql = "SELECT * FROM TIMELINE";
	            PreparedStatement pStmt = conn.prepareStatement(sql);

	            ResultSet rs = pStmt.executeQuery();

	            //結果を表示
	            while (rs.next()) {
	                String ad = rs.getString("AD");
	                String battlename = rs.getString("BATTLENAME");
	                String remarks = rs.getString("REMARKS");

	                System.out.println(ad + " " + battlename + " " + remarks);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

}
