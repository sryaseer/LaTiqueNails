package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseOperator {
    //Database connections made from this class, so no need to copy and paste this stuff into each new class.
    //please extend DatabaseOperator to your controller class if you create a new one.


    final String hostname = "";
    final String dbName = "";
    final String port = "3306";
    final String username = "";
    final String password = "";
    final String AWS_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;
    final String DB_URL = "jdbc:derby:EmployeeDB;create=true";


}
