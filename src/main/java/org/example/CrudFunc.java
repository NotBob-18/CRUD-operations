package org.example;

import java.sql.*;
public class CrudFunc {
    private static final String DELETE_REMINDER_SQL = "DELETE FROM reminder WHERE id = ?";


    private static final String URL = "jdbc:postgresql://localhost:5432/Demo";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
//        updateTaskById(4, "swimming with the WHALE BABIES");
//        addTask (3, "something somewhere", 2, false);
//        readTask();

    }

    // Update Function
    public static void updateTaskById(int id, String task) {
        String sql = "UPDATE reminder SET task = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, task);
            preparedStatement.setInt(2, id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Task updated successfully.");
            } else {
                System.out.println("No record found with the given id.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Add Function
    public static void addTask(int id, String task, int importance, boolean completed) {
        String sql = "INSERT INTO reminder (id, task, importance, completed) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, task);
            preparedStatement.setInt(3, importance);
            preparedStatement.setBoolean(4, false);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Task added successfully.");
            } else {
                System.out.println("Failed to add task.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }


//    private static final String DELETE_REMINDER_SQL = "DELETE FROM reminder WHERE id = ?";

    public static void deleteFunc(int id) throws SQLException {
        Connection conn = DatabConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(DELETE_REMINDER_SQL);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("succsessfully deleted");

    }


    // Read All Tasks Function
    public static void readTask() {
        String sql = "SELECT * FROM reminder";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String task = resultSet.getString("task");
                int importance = resultSet.getInt("importance");
                boolean completed = resultSet.getBoolean("completed");

                System.out.println("Task ID: " + id);
                System.out.println("Task: " + task);
                System.out.println("Importance: " + importance);
                System.out.println("Completed: " + completed);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }



//    public static void readTask(int id) {
//        String sql = "SELECT * FROM reminder WHERE id = ?";
//
//        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//
//            preparedStatement.setInt(1, id);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                String task = resultSet.getString("task");
//                int importance = resultSet.getInt("importance");
//                boolean completed = resultSet.getBoolean("completed");
//
//                System.out.println("Task ID: " + id);
//                System.out.println("Task: " + task);
//                System.out.println("Importance: " + importance);
//                System.out.println("Completed: " + completed);
//            } else {
//                System.out.println("No record found with the given id.");
//            }
//        } catch (SQLException e) {
//            System.out.println("Database error: " + e.getMessage());
//        }
//    }
}





















