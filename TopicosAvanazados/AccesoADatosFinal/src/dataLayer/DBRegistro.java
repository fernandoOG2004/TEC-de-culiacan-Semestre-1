package dataLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class DBRegistro extends DBConexion{
	
	public static Registro DBLeeRegistro(int clave) throws Exception {
	Registro reg = new Registro();
    Connection con = GetConnection();
    String Select = "SELECT * FROM [Registro] WHERE [Clave] = " + clave; // Sin comillas simples
    PreparedStatement st = con.prepareStatement(Select);
    ResultSet rs = st.executeQuery();
    if (!rs.wasNull()) {
        rs.next();
        reg.setCve(rs.getInt(1));
        reg.setNombre(rs.getString(2));
        reg.setDireccion(rs.getString(3));
        reg.setTelefono(rs.getString(4));
        reg.setSaldo(rs.getFloat(5));
        reg.setBorrado(rs.getInt(6) == 1);
    }
    con.close();
    rs.close();
    return reg;
}

public static void DBInsert(Registro reg) throws Exception {
    Connection con = GetConnection();
    String Select = "INSERT INTO [Registro] ([Clave], [Nombre], [Direccion], [Telefono], [Saldo], [Borrado]) "
            + "VALUES ('" + reg.getCve() + "','" + reg.getNombre() + "','" + reg.getDireccion() + "','" 
            + reg.getTelefono() + "','" + reg.getSaldo() + "','" + (reg.isBorrado() ? 1 : 0) + "')";
    PreparedStatement st = con.prepareStatement(Select);
    st.executeUpdate();
    con.close();
}

public static void DBUpdate(Registro reg) throws Exception {
    Connection con = GetConnection();
    String Select = "UPDATE [Registro] SET "
            + "[Clave]='" + reg.getCve()
            + "',[Nombre]='" + reg.getNombre()
            + "',[Direccion]='" + reg.getDireccion()
            + "',[Telefono]='" + reg.getTelefono()
            + "',[Saldo]='" + reg.getSaldo()
            + "',[Borrado]='" + (reg.isBorrado() ? 1 : 0)
            + "' WHERE [Clave]=" + reg.getCve();
    PreparedStatement st = con.prepareStatement(Select);
    st.executeUpdate();
    con.close();
}

public static void DBDeleteFisico(int clave) throws Exception {
    Connection con = GetConnection();
    String Select = "DELETE FROM [Registro] WHERE [Clave]=" + clave;
    PreparedStatement st = con.prepareStatement(Select);
    st.executeUpdate();
    con.close();
}

public static void DBDeleteLogico(int clave, boolean borrar) throws Exception {
    Connection con = GetConnection();
    String Select = "UPDATE [Registro] SET [Borrado]='" + (borrar ? "1" : "0") + "' WHERE [Clave]=" + clave;
    PreparedStatement st = con.prepareStatement(Select);
    st.executeUpdate();
    con.close();
}

public static int SiguienteClave() throws Exception {
    int folio = Integer.MAX_VALUE;
    Connection con = GetConnection();
    String SELECT = "SELECT MAX([Clave]) FROM [Registro]"; // Corregir uso de comillas
    PreparedStatement st = con.prepareStatement(SELECT);
    ResultSet rs = st.executeQuery();
    if (rs != null && rs.next())
        folio = rs.getInt(1) + 1;
    con.close();
    return folio;
}

public static DefaultListModel<String> Listado() throws Exception {
    DefaultListModel<String> lista = new DefaultListModel<String>();
    lista.clear();
    Connection con = GetConnection();
    String SELECT = "SELECT [Clave], [Nombre], [Borrado] FROM [Registro]";
    PreparedStatement st = con.prepareStatement(SELECT);
    ResultSet rs = st.executeQuery();
    if (rs != null)
        while (rs.next())
            lista.addElement(rs.getInt(1) + " " + rs.getString(2) + " " + (rs.getInt(3) == 1 ? "*" : ""));
    con.close();
    return lista;
}
}

