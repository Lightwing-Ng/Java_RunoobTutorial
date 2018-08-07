package com.lightwing.ch38_MySQL;

import java.sql.*;

/**
 * @ClassName MySQLDemo
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 20:42
 * @Version 1.0
 **/
public class MySQLDemo {
    // JDBC 驱动名及数据库 URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/CRM";
    // 数据库的用户名与密码，需要根据自己的设置
    private static final String USER = "root";
    private static final String PASS = "canton0520";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1.注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            // 2.打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 3.执行查询
            System.out.println("实例化 Statement 对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT " +
                    "`cust_id`, `cust_name`, `cust_phone`, `cust_address`" +
                    "FROM `customer`";
            ResultSet rs = stmt.executeQuery(sql);

            // 4.展开结果集数据库
            while (rs.next()) {
                // 5.通过字段检索
                int id = rs.getInt("cust_id");
                String name = rs.getString("cust_name");
                String phone = rs.getString("cust_phone");
                String add = rs.getString("cust_address");

                // 6.输出数据
                System.out.print("Customer ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Phone: " + phone);
                System.out.println(", Address: " + add);
                System.out.print("\n");
            }
            // 7.完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // 8.处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 9.关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException ignored) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
