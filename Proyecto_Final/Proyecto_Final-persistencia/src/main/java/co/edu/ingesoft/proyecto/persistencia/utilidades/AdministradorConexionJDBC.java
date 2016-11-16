/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.utilidades;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 * @author TOSHIBAP55W
 *
 */
public class AdministradorConexionJDBC {

public static Connection getConexion()throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/proyectofinal";
        String user="root";
        String password="1234";
        
        Connection con= DriverManager.getConnection(url, user, password);
        return con;
	}
}
