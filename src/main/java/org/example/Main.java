package org.example;


import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection con = DatabConnection.getConnection();
            if (con == null) {
                System.out.println("Houston, We're ready to Rock!!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (Exception e) {

        }
    }

}