import java.sql.*;
import java.util.List;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class DB {
    String name, title,desc, price,selectQuery;
    Integer ID;
    Statement statement=null;
    ResultSet resultSet=null;
    Connection connection = null;
    public DB() {


        try {
            Class.forName("org.sqlite.JDBC");
            String dbFile = "C:/Users/lbartosik/OneDrive - PEPCO/Dokumenty/SQL/sqlite/books";
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
        public void saveBookDB(List<Book> books) {

            try {
//                statement = connection.createStatement();
//                String selectQuery="SELECT ID, Name  FROM Persons ";
//                resultSet=statement.executeQuery(selectQuery);
//
//                while(resultSet.next()){
//                    name=resultSet.getString("Name");
//                    ID=resultSet.getInt("ID");
//
//                }
//                System.out.println(name+ID);

                statement = connection.prepareStatement();


                for(Book zapis:books) {
                    title=zapis.getTitle(); //Wywołanie metody
                    desc=zapis.getDesc();  //To są metody obiektu
                    price=zapis.getPrice();
                    System.out.println(title+desc+price);
//                    selectQuery = "INSERT INTO books VALUES(1, '" + title + "', '" + desc + "', " + price + ")";
                    selectQuery = "INSERT INTO books VALUES(1,?,?,?)";
                    selectQuery.setObject(1,title);
                }
                resultSet=statement.executeQuery(selectQuery);

            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
