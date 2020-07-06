package preparedStatementEg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementEg {
public static void main(String[] args) throws SQLException {
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb", "tiger");
              PreparedStatement prepareStatement = connection.prepareStatement("insert into EMP_TBL values (?,?,?)");
              prepareStatement.setInt(1, 4);
              prepareStatement.setString(2, "ramu");
              prepareStatement.setDouble(3, 3421);
                  int executeUpdate = prepareStatement.executeUpdate();
                  System.out.println(executeUpdate);
              
              //              ResultSet executeQuery = prepareStatement.executeQuery();
//              int int1 = executeQuery.getInt("id");
              prepareStatement.close();
              connection.close();
}
}
