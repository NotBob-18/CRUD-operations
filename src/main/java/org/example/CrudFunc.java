package org.example;

import java.sql.*;
public class CrudFunc {
    private static final String DELETE_REMINDER_SQL = "DELETE FROM reminder WHERE id = ?";

    public static void deleteFunc(int id) throws SQLException {
        Connection conn = DatabConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(DELETE_REMINDER_SQL);
        ps.setInt(1,id);
        ps.executeUpdate();



    }
}

