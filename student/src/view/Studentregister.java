package view;

import java.sql.Connection;
import java.sql.DriverManager;

public class Studentregister {
	 static Connection connect() {
		   Connection conn = null;
		   String url="jdbc:mysql://localhost:3306/dh8c2";
		    String user="root";
		    String pass="";
		    try {
		    	Class.forName("com.mysql.cj.jdbc.Driver");
		        conn = DriverManager.getConnection(url, user , pass) ;
		    	System.out.println("you have connected to mysql...congraturation");
		    }catch (Exception e) {
		    	e.printStackTrace();
		    }
		    return conn;
   }
	 
}
