package ads.tema;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAds {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/ads";
		String user="root";
		String pass="";
		
		try {
			Connection conn = DriverManager.getConnection(url,user,pass);
			
//			//AD create
//			String title="Samsung";
//			Integer amount=5;
//			Date date = new Date (9/9/2023);
//			String insertEventQuery= "insert into aduri (title,amount,published_at)"+
//					"values('"+title +"','"+amount+"','"+date+"')";
//			Statement c1= conn.createStatement();
//			c1.executeUpdate(insertEventQuery);
//			
			
			
//			//Delete
//			String deleteQuery="Delete from event where id = 2";
//			Statement d1= conn.createStatement();
//			d1.executeUpdate(deleteQuery);
			
			//Read
//			String readAllQuery="select * from aduri";
//			Statement r1=conn.createStatement();
//			ResultSet rs= r1.executeQuery(readAllQuery);
//			
//			while(rs.next()) {
//				System.out.print(rs.getString("title")+" ");
//				System.out.println(rs.getInt("amount")+" times");
//				System.out.println(rs.getString("published_at"));
//			}
			
			
			//Update
//			String updateQuerry="update aduri set title = 'Samsung Galaxy'where id = 3";
//			Statement s4= conn.createStatement();
//			s4.executeUpdate(updateQuerry);
//			
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}
