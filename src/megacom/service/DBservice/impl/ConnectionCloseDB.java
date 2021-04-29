package megacom.service.DBservice.impl;

import megacom.service.DBservice.DBcloseService;
import megacom.service.DBservice.DBopenService;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCloseDB implements DBopenService, DBcloseService {

    static Connection connection;

    private void ConnectionSQLite() {
        connection = getConnection();
        System.out.println("connection");
    }

    private Connection getConnection() {
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\Azamat\\Javaitschool\\5month\\AllMethodsStreamAPI\\allStreamAPI.db");
            System.out.println("Connection");
            return connection;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }



   private void close() {
        try{
            connection.close();
            System.out.println("Close connection");
        }catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }

    @Override
    public void openDB() {
        ConnectionSQLite();
    }

    @Override
    public void DBclose() {
        close();
    }
}
