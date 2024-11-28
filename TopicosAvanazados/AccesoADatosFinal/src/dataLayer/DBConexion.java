package dataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConexion {
	private static String ControladorSQLServer = "com.microsoft.sqlserver.jdbc";
	private static String urlConexion = 
			"jdbc:sqlserver://localhost:1433;"
			+ "database=Topicos;"
			+ "user=james;"
			+ "password=papu2020;"
			+ "loginTimeout=30;"
			+ "trustServerCertificate=true";
	private static Connection con = null;
	
	@SuppressWarnings("finally")
	public static Connection GetConnection() {
		try {
			//Class.forName(ControladorSQLServer);
			con = DriverManager.getConnection(urlConexion);
		} /*catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e, "Error con la clase del driver de SQL Server: " + e.getMessage(), JOptionPane.ERROR);
			con = null;
		}*/ catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "Error en la conexión con la BD: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
			con = null;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error del programa: " + e.getMessage(), JOptionPane.ERROR);
			con = null;
		} finally {
			return con;
		}
	}
}
