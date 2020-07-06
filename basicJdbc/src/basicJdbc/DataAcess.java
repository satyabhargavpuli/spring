package basicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAcess {
public static void main(String[] args) throws SQLException {
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb","tiger");
	Statement statement = connection.createStatement();
	//statement.execute("insert into EMP_TBL values (1,'satya',1234)");
	//statement.executeUpdate("insert into EMP_TBL values (2,'bhargav',1234)");
	ResultSet resultSet = statement.executeQuery("select * from EMP_TBL");
                    while(resultSet.next())
                    {
                    	String eno = resultSet.getString("id");
                    	String name = resultSet.getString("name");
                    	String salary = resultSet.getString("salary");
                    	System.out.println(eno+""+name+""+salary);
                    }
	statement.close();
	connection.close();
	
}
}
