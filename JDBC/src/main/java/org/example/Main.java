package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pwd = "upadhyayji";
        String selectstudents = " Select * from students ";
        String createTable = "create table students (id int primary key auto_increment,name varchar(20),department varchar(20))";
        String insertData = "insert into students(name,department) values('Krunali','Operations'),('Amol','PowerBI'),('Rehan','PLSQL')";
        String dropTable = "drop table students";
        try (Connection con = DriverManager.getConnection(url, user, pwd);
             Statement stmt = con.createStatement()) {

            int rowsUpdated1 = stmt.executeUpdate(createTable);
            int rowsUpdated2 = stmt.executeUpdate(insertData);

            boolean res1 = stmt.execute(insertData);

            if (res1) {
                ResultSet rs = stmt.getResultSet();
                while (rs.next()) {
                    System.out.println("id : " + rs.getInt("id"));
                    System.out.println("name : " + rs.getString("name"));
                    System.out.println("department : " + rs.getString("department"));
                }
            } else {
                int rowsUpdated = stmt.getUpdateCount();
            }

            try (ResultSet rs = stmt.executeQuery(selectstudents)) {
                while (rs.next()) {
                    System.out.println("id : " + rs.getInt("id"));
                    System.out.println("name : " + rs.getString("name"));
                    System.out.println("department : " + rs.getString("department"));
                }

            }

            int drop = stmt.executeUpdate(dropTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
    
