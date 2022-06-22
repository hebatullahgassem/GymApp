
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conn {
public static Connection getConnection(){
Connection c = null;
String url = "jdbc:sqlserver://localhost;Database=gym;";
String user = "hg";
String password = "test@123"; 
try{
c = DriverManager.getConnection(url, user, password);
if(c != null){
DatabaseMetaData dm = c.getMetaData();
System.out.println(dm.getDriverName());
System.out.println(dm.getDatabaseProductName());
System.out.println(dm.getDatabaseProductVersion());
}
} 
catch(SQLException e){
System.out.println(e.getMessage());
}
return c;
}    
}
