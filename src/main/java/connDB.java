import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connDB {



    static void connection(){

        Connection connection=null;
        try {
            Class.forName("org.sqlite.JDBC");
            String dbFile = "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/sqlite/myDB";
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }
}
