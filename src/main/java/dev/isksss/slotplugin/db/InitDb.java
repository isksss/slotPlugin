package dev.isksss.slotplugin.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDb {
    Connection connection = null;
    public void Init(){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:./slot.sqlite");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS [chest] (\n" +
                    "[id] INTEGER NOT NULL UNIQUE,\n" +
                    "[location] BLOB NOT NULL UNIQUE,\n" +
                    "PRIMARY KEY([id],[location])\n" +
                    ");");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
