/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JUAN
 */
public class Conexion {
    // Statement Sentencias;

    public Connection conexion;

    public Connection Conexion1() throws SQLException {
        try {
            // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://DESKTOP-NEM3CPC:1433;databaseName=Inicio;user=usuario;password=123;";
            //  conexion = DriverManager.getConnection(url);
            Class.forName("com.mysql.jdbc.Driver");
  //conexion = DriverManager.getConnection("jdbc:mysql://10.2.12.91:3306/Inicio","root","admin2019.");
           conexion = DriverManager.getConnection("jdbc:mysql://10.2.12.91:3306/Inicio","root2", "admin2019.");
          //return "si";
        } catch (Exception ex) {

            //return "no "+ex;
        }
       return conexion ;
    }

}
