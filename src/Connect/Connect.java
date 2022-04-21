
package Connect;
import  java.sql.*;
/**
 *
 * @author LOC
 */

class Connected {
    Connection con;
    
    public  Connection getConnect() {
        String url = "jdbc:mysql://localhost:3306/database";
        String user = "root";
        String password = "";
        System.out.println("OK !");
        try {
             con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("!!!");
        }
                
       
        
        return con;
    }
}



public class Connect {
    public static void main(String[] args) {
        new Connected().getConnect();
    }
}
