package com.zzw.springboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try
        {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=");
            Statement   s = (Statement) conn.createStatement();
            int result = s.executeUpdate("CREATE DATABASE databasename");
        }


        catch ( Exception e)
        {
            e.printStackTrace();
        }
    }
}
