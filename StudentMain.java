package jdbc;

import java.util.Scanner;
import java.sql.*;

public class StudentMain {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
	    DriverManager.registerDriver(driver);	
	    String url="jdbc:mysql://localhost:3306/student";
	    String user="root";
	    String password="Vignesh@6776";
	    Connection con=DriverManager.getConnection(url,user,password);
	    boolean loop=true;
	    Student s=new  Student();
	    while(loop) {
		System.out.println("enter id");
		String id=sc.next();
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter School name");
		String schoolname=sc.next();
		System.out.println("Enter address");
		String Address=sc.next();
		System.out.println("Enter Tamil  Mark");
		int tamil=sc.nextInt();
		if(tamil<0) {
			tamil=0;
		}
		System.out.println("Enter English  Mark");
		int english=sc.nextInt();
		if(english<0) {
			english=0;
		}
		System.out.println("Enter Maths  Mark");
		int maths=sc.nextInt();
		if(maths<0) {
			maths=0;
		}
		System.out.println("Enter Scinece  Mark");
		int science=sc.nextInt();
		if(science<0) {
			science=0;
		}
		System.out.println("Enter Social  Mark");
		int social=sc.nextInt();
		if(social<0) {
			social=0;
		}
		s.marks(tamil,english,maths,science,social);
	    PreparedStatement pstmt=con.prepareStatement("insert into studentdetails value(?,?,?,?)");

	    pstmt.setString(1, id);
	    pstmt.setString(2, name);
	    pstmt.setString(3, schoolname);
	    pstmt.setString(4, Address);
	    int result=pstmt.executeUpdate();
	    
		//System.out.println(result);
	        pstmt=con.prepareStatement("insert into studentmarks value(?,?,?,?,?,?,?)");

	    pstmt.setString(1, id);
	    pstmt.setInt(2, tamil);
	    pstmt.setInt(3, english);
	    pstmt.setInt(4, maths);
	    pstmt.setInt(5,science );
	    pstmt.setInt(6, social);
	    pstmt.setString(7, Student.grade);
	     result=pstmt.executeUpdate();
	     System.out.println(result);
		
		System.out.println("do you want to add Details of Student");
		  System.out.println("yes Means Type yes or type something");
		  String access=sc.next();
		  if(access.equals("yes")) {
			  System.out.println("Carry on"); 
			  }
		  else {
			  loop=false;
			  System.out.println("ok ");
		  }
	    }
	    con.close();
	}

}
