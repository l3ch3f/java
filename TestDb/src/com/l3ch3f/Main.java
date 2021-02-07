package com.l3ch3f;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	    try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/codejavadb? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Welkom01!");
        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
