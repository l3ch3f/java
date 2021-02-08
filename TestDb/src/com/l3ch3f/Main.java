package com.l3ch3f;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	    try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/codejavadb? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Welkom01!");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
            /*
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                                "VALUES('Mc Fergus', 12356231, 'mcfergus@example.com' )");
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('Jane', 15356231, 'jane@example.com' )");
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('joe', 16231, 'joe@example.com' )");
            */
            /*
            statement.execute("UPDATE contacts SET phone=123421 WHERE name='Jane'");

            statement.execute("DELETE FROM contacts WHERE name='joe' ");
            */

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " + results.getInt("phone")+ " " + results.getString("email"));
            }
            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
            e.printStackTrace();
        }
    }
}
