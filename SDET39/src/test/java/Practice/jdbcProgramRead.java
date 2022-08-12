package Practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class jdbcProgramRead {


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//step 1:
		Driver driverRef=new Driver();
		
	//step2:
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","root");
		
		//step:3
		
		Statement stat=conn.createStatement();
		String selectQuery="select * from students";
		
		//step:4
		
		ResultSet result=stat.executeQuery(selectQuery);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		//step 5
		
		conn.close();
		
		
	}

}



