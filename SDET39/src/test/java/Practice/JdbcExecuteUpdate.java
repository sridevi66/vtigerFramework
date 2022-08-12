package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		
		// TODO Auto-generated method stub
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","root");
		Statement stt=conn.createStatement();
		String UpdateQuery="insert into students(first_name,last_name,address)values('sai','ram','mumbai')";
        int result=stt.executeUpdate(UpdateQuery);
        if(result==1)
        {
        	System.out.println("user is created");
        }
        else
        {
        	System.out.println("user not created");
        }
        conn.close();
	}

}
