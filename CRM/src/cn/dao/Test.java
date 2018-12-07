package cn.dao;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
public class Test {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            Connection conn= DriverManager.getConnection(url,"root","admin123");
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
