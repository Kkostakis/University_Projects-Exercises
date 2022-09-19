import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Scanner;


@SuppressWarnings("unused")
public class MysqlConnect{
@SuppressWarnings("deprecation")
public static void main(String[] args) throws SQLException, IOException {
	System.out.println("MySQL Connect Example");
	Connection conn = null;
	String url = "jdbc:mysql://127.0.0.1:3306/";
	String dbName = "eternalpr";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root"; 
	String password = "";

	try{
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url+dbName,userName,password);
		System.out.println("Connected to database");

	}catch(Exception e) {
		e.printStackTrace();
	
	} 

	try{
		
		  System.out.println("User please select one of the following choices(1-7)");
		  Scanner read = new Scanner(System.in);
		  BufferedReader enter =  new BufferedReader(new InputStreamReader(System.in)); 
		  int choice, phone_number, fax, mail_code, country_code;
		  
		  do
		  {
			  System.out.println("Update flights , clients, bookings, according to airline");
			  System.out.println("Recover list of flights that every airline has in schedule");
			  System.out.println("Recover list of flights which do not have empty seats ");
			  System.out.println("User please select one of the following choices(1-7)");
			  System.out.println("Execute commands of tickets booking of a certain flight of specific airline");
			  System.out.println("Recover specific booking according to booking_id and save it as paid in system after payment");
			  System.out.println("User please select one of the following choices(1-7):");
			 choice = read.nextInt();
			  
		  }
		  while(choice < 1 || choice > 7);
		  
			  // Client 
			  System.out.print("Email_Address:");
			  String email = enter.readLine();
			  
			  System.out.print("Address:");
			  String address = enter.readLine();
			  
			  do
			  {
			     System.out.print("Phone_Number:");
			     phone_number = read.nextInt();
			  }while(phone_number < 0);
			  
			  System.out.print("Client_Name:");
			  String name = enter.readLine();
			  
			  System.out.print("Client_Surname:");
			  String surname = enter.readLine();
			  
			  System.out.print("Country:");
			  String country = enter.readLine();
			  
			  System.out.print("City:");
			  String city = enter.readLine();
			  
			  do
		      {
				  System.out.print("Fax:");
			      fax = read.nextInt();
		      }while(fax < 0);
			  
			  do
			  {
			      System.out.print("Mail_Code:");
			      mail_code = read.nextInt();
			  }while(mail_code < 0);
			  
			  do
			  {
			      System.out.print("Country_Code:");
			      country_code = read.nextInt();
			  }while(country_code < 0);
			  
			  // Booking
			  
			  System.out.print("Booking ID:");
			  int booking_id = read.nextInt();
			  
			  System.out.println("Location Booking:");
			  String location_booking = enter.readLine();
			  
			  System.out.print("Booking Date:"); 
			  String booking_date = enter.readLine();
			  
			  
			  System.out.print("Departure Date and Time:");
			  String form = enter.readLine();
			  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			  LocalDateTime departure_date_time = LocalDateTime.parse(form, formatter);
			  
			  System.out.print("Landing Date and Time:");
			  String form1= enter.readLine();
			  DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			  LocalDateTime landing_date_time= LocalDateTime.parse(form1, formatter1);
			  
			  System.out.print("Seat Category:"); 
			  String seat_category = enter.readLine();
			  
			  System.out.print("Total Price:"); 
			  double total_price = read.nextDouble();
			  
			  
			  System.out.print("Seat state:"); 
			  boolean seat_state = read.nextBoolean();
			  
			  // Flight//
			  System.out.println("Flight"); 
			  String flight_id = enter.readLine();
			  
			  System.out.println("Airline Code : "); 
			  String airline_code = enter.readLine();
			  
			  System.out.println("Business : "); 
			  boolean business = read.nextBoolean();
			  
			  System.out.println("Smokers : "); 
			  boolean Smokers = read.nextBoolean();
			  
			  System.out.println("Seats Availability : "); 
			  int seats_availability = read.nextInt();
			  
			  System.out.println(" Flight Duration : "); 
			  float flight_duration = read.nextFloat();
		  
		  
		  
		Statement st = conn.createStatement();
		int val = st.executeUpdate("INSERT INTO client  VALUES ('andrewkollins12@gnail.com','St.Reagants 23','694433201','Andrew','Kollins','England','London','34500212','12468','1112201')");
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
		ResultSet res = st.executeQuery("SELECT * FROM client");
		while (res.next()) {
			String v1 = res.getString("email_address");
			String v2 = res.getString("address");
			int v3 = res.getInt("phone_number");
			String v4 = res.getString("client_name");
			String v5 = res.getString("client_surname");
			String v6 = res.getString("country");
			String v7 = res.getString("city");
			int v8 = res.getInt("fax");
			int v9 = res.getInt("mail_code");
			int v10 = res.getInt("country_code");
			System.out.print("\n");
		}
		}catch(SQLException s){
			System.out.println("SQL code does not execute.");
		} 

		conn.close();
//		System.out.println("Disconnected from database");
}
}
