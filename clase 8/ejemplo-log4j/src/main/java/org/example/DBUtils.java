package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    public Connection recuperarConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String usuario = "root";
        String clave = "root";
        String url = "jdbc:mysql://localhost/ejemplo12";

       Connection connection = DriverManager.getConnection(url,usuario,clave);
        return  connection;
    }
}
