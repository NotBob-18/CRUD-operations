package org.example;


import java.sql.*;

public class CrudFunc {

        private static final String URL = "jdbc:postgresql://localhost:5432/Demo";
        private static final String USER = "postgres";
        private static final String PASSWORD = "123456";

        public static void main(String[] args) {
            updateTaskById(1, "Updated Task");

        }

        // Update Function
        public static void updateTaskById(int id, String newTask) {
            String sql = "UPDATE reminder SET task = ? WHERE id = ?";

            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, newTask);
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
    }


