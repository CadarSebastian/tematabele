package angajati.tema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAngajati {

	public static void main(String[] args)throws SQLException {
		String url="jdbc:mysql://localhost:3306/administratie";
		String user="root";
		String pass="";
		
		try {
			Connection conn = DriverManager.getConnection(url,user,pass);
			
			//Angajat create
//			String nume="Viorel Musetel";
//			Integer varsta=50;
//			Integer sectie=6;
//		String insertEventQuery= "insert into angajati (nume,varsta,sectie)"+
//				"values('"+nume +"','"+varsta+"','"+sectie+"')";
//			Statement c1= conn.createStatement();
//			c1.executeUpdate(insertEventQuery);
			
			//Delete
//			String deleteQuery="Delete from angajati where id = 3";
//			Statement d1= conn.createStatement();
//			d1.executeUpdate(deleteQuery);
			
			//Read
//			String readAllQuery="select * from angajati";
//			Statement r1=conn.createStatement();
//			ResultSet rs= r1.executeQuery(readAllQuery);
//			
//			while(rs.next()) {
//				System.out.println(rs.getString("nume"));
//				System.out.println("In varsta de "+rs.getInt("varsta")+" ani");
//				System.out.println("Lucrand la sectia "+rs.getInt("sectie"));}
			
			//Update
//			String updateQuerry="update angajati set varsta = '42'where id = 2";
//			Statement s4= conn.createStatement();
//			s4.executeUpdate(updateQuerry);
			
			conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
	}

}
