package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    static Connection connection = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection("\"jdbc:postgresql://localhost:5432/spotify?", "admin","123");
        }catch (SQLException ex){
            System.out.println("SQLExcepetion: "+ex.getMessage());
            System.out.println("SQLState: "+ex.getSQLState());
            System.out.println("Error: "+ex.getErrorCode());
        }
        return connection;
    }
}

