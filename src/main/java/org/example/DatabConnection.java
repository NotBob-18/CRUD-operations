package org.example;
import java.sql.*;

public class DatabConnection {


    public static Connection getConnection()  {


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String password = "123456";
        Connection conn = null;

        try {
            Class.forName(
                    "org.postgresql.Driver"); // Driver name
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {

            conn = DriverManager.getConnection(

             conn = DriverManager.getConnection(

                    url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(
                "Connection was successfully established");



        return conn;

       return conn;

    }
}

