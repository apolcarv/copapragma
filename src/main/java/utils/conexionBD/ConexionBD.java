package utils.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public Connection connection()  throws SQLException {


        Connection conn = DriverManager.getConnection("",
                "", "");

        //  Connection conn = DriverManager.getConnection(System.getProperty("url"),
        //  System.getProperty("user"), System.getProperty("password"));

        if (conn != null) {
            System.out.println("Conectado Correctamente BD Data Prueba");
        } else {
            System.out.println("fallo.....");
        }
        return conn;
    }

}

