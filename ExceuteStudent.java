package jdbc;

import java.sql.*;

public class ExceuteStudent {

	public static void main(String[] args) throws SQLException {
		Driver driver=new com.mysql.cj.jdbc.Driver();
	    DriverManager.registerDriver(driver);	
	    String url="jdbc:mysql://localhost:3306/student";
	    String user="root";
	    String password="Vignesh@6776";
	    Connection con=DriverManager.getConnection(url,user,password);
	    Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select name, id from studentdetails");
           while(rs.next()) {
        	   System.out.println(rs.getString(1)+" "+ rs.getInt(2));
           }
     con.close();      
	}

}
