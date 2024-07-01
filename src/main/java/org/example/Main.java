package org.example;
import java.util.Scanner;


import java.sql.*;

import static org.example.CrudFunc.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {


//        CrudFunc.deleteFunc(1);
//CrudFunc.updateTaskById(2, "");
//        CrudFunc.readTask();

        System.out.println("Enter task ID");
        int id = Integer.parseInt(scanner.nextLine());


        System.out.println("Enter task name:");

        String task = scanner.nextLine();


        System.out.println("enter the importance of the task");
        int importance = Integer.parseInt(scanner.nextLine());


       CrudFunc.addTask(id,task,importance);


    }
}