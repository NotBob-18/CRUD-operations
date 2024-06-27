package org.example;


import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

CrudFunc.addTask(2,"", 2, false);
//        CrudFunc.deleteFunc(2);
CrudFunc.updateTaskById(2, "");
//        CrudFunc.readTask();
    }
}