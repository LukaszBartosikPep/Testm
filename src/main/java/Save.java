import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Save {
//    String name, title,desc, price,selectQuery;

    Connection connection = null;
//    PreparedStatement insertQuery;
    public Save() {


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

//                statement = connection.prepareStatement();

                String title=null;
                String desc=null;
                String price=null;

                for(Book save:books) {
                    title=save.getTitle(); //Wywołanie metody
                    desc=save.getDesc();  //To są metody obiektu
                    price=save.getPrice();
                    System.out.println(title+desc+price);
//                    selectQuery = "INSERT INTO books VALUES(1, '" + title + "', '" + desc + "', " + price + ")";

//
                }
//                resultSet=statement.executeQuery(insertQuery);
                String sql=("INSERT INTO products(title, desc, price) VALUES(?,?,?);");
                PreparedStatement insertQuery=connection.prepareStatement(sql);
                insertQuery.setString(1,title);
                insertQuery.setString(2,desc);
                insertQuery.setString(3,price);

                insertQuery.execute();
//                 int rows=insertQuery.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
