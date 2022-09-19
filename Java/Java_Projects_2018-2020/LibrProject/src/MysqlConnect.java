import java.sql.*;

public class MysqlConnect{
public static void main(String[] args) throws SQLException {
	System.out.println("MySQL Connect Example");
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "lib";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root"; 
	String password = "";

	try{
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/+lib","root","");
		System.out.println("Connected to database");
	}catch(Exception e) {
		e.printStackTrace();
	
	} 

	try{
		Statement st = conn.createStatement();
		int val = st.executeUpdate("INSERT INTO publisher VALUES('P888','Giorgos Pappas')");
		System.out.println("1 row affected");
	/****************** Παραδειγμα εκτελεσης Update query**************************	
		// create the java mysql update preparedstatement
	    String query = "update publisher set publisher_code = ? where publisher_code = ?";
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
	    //preparedStmt.setInt   (1, 6000);
	    preparedStmt.setString (1, "P887");
	    preparedStmt.setString(2, "P888");
	    // execute the java preparedstatement
        preparedStmt.executeUpdate();
	*******************Τέλος Παραδείγματος εκτέλεσης Update query******************/
	}catch(SQLException s){
		System.out.println("SQL statement is not executed!");
	}

	
	

  
	
	
    try{
		Statement st = conn.createStatement();
		//INSERT COMMENTS THE FIRST TRY WITH INSERT AND AFTER REMOVE THE COMMENTS OF DELETE QUERY.
		// st.execute("Delete  FROM publisher WHERE publisher_code='P888'");		
		ResultSet res = st.executeQuery("SELECT * FROM publisher");
		System.out.println("PUBLISHER_CODE: " + "\t" + "PUBLISHER_NAME: ");
		while (res.next()) {
			String i = res.getString("PUBLISHER_CODE");
			String s = res.getString("PUBLISHER_NAME");
			System.out.println(i + "\t\t" + s);
		}
		}catch(SQLException s){
			System.out.println("SQL code does not execute.");
		} 

		conn.close();
//		System.out.println("Disconnected from database");
}
}
