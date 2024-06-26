package org.example;


import java.sql.*;

public class Main {
    public static void main(String[] args) {

//        CrudFunc.addTask(3, "Study for exam");

//        try {
//            CrudFunc.deleteFunc(1);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }





        try {
            Connection conn = DatabConnection.getConnection();
            if (conn != null) {
//                System.out.println("Houston, We're ready to Rock!!");
//                CrudFunc.updateTaskById(2, "sleeping with the fishes");
//                CrudFunc.addTask(3, "something somewhere", 2, false);
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}