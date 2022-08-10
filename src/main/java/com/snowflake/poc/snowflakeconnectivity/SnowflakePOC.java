package com.snowflake.poc.snowflakeconnectivity;

import java.sql.*;
import java.util.Properties;

public class SnowflakePOC {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("user", "anuradharajakumar");
        properties.put("password", "****");
        properties.put("account", "co56026.us-east-2.aws");
        properties.put("warehouse", "COMPUTE_WH");
        properties.put("role", "ACCOUNTADMIN");
        properties.put("db", "CITIBIKE");
        properties.put("schema", "PUBLIC");

        String url = "jdbc:snowflake://https://co56026.us-east-2.aws.snowflakecomputing.com/";

        try {
            Connection con = DriverManager.getConnection(url, properties);
            System.out.println(con);
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select count(*) AS RECORDCOUNT from TRIPS");
            resultSet.next();
            int count = resultSet.getInt("RECORDCOUNT");
            resultSet.close();
            System.out.println("MyTable has " + count + " row(s).");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
