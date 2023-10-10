package jail.tema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJail {

	public static void main(String[] args)throws SQLException {
		String url="jdbc:mysql://localhost:3306/inchisoare";
		String user="root";
		String pass="";
		
		try {
			Connection conn = DriverManager.getConnection(url,user,pass);
			
			//ad new
//			String name="Monopoly Man";
//			String crime="Spalare de bani";
//			Integer time=1;
//		String insertEventQuery= "insert into prizonieri (name,crime,time)"+
//				"values('"+name +"','"+crime+"','"+time+"')";
//			Statement c1= conn.createStatement();
//			c1.executeUpdate(insertEventQuery);
			
			//Delete
//			String deleteQuery="Delete from prizonieri where id = 2";
//			Statement d1= conn.createStatement();
//			d1.executeUpdate(deleteQuery);
			
			//Read
//			String readAllQuery="select * from prizonieri";
//			Statement r1=conn.createStatement();
//			ResultSet rs= r1.executeQuery(readAllQuery);
//			
//			while(rs.next()) {
//				System.out.println(rs.getString("name"));
//				System.out.println("Crima: "+rs.getString("crime"));
//				System.out.println("Sentinta: "+rs.getInt("time")+" ture");}
			
			//Update
//			String updateQuerry="update prizonieri set time = '2'where id = 1";
//			Statement s4= conn.createStatement();
//			s4.executeUpdate(updateQuerry);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
