package Ejercicios_Sesion4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.protocol.Resultset;

public class AccesoBD_S4 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "pedidos";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private Connection conecta;
	
	private PreparedStatement consulta;
	private String cadenaSQL; 

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null; // = conecta.close();
	}
	
	public void importePedido(int numero) {
		try {  
			CallableStatement proc= conecta.prepareCall("Select importePedido(?) ");
			proc.setInt(1, numero);         
			ResultSet rs=proc.executeQuery();
			rs.next();
			if (rs.getDouble(1)<0)
				System.out.println("El n�mero de pedido "+numero+" no existe.");
			else System.out.println("El total del pedido "+numero+" es "+rs.getBigDecimal(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	
	public void productosCBM(int categoria) {
		try {
			CallableStatement proc = conecta.prepareCall("CALL productosCategoriaBajoMinimos(?) ");
			proc.setInt(1, categoria);
			ResultSet rs= proc.executeQuery(); 
			if (rs.next()) {
				System.out.println("Nombre Producto - Precio - Exsistencias - M�nimo");
				System.out.println("--------------------------------------------------");
				System.out.println(rs.getString(1) + " | " + rs.getBigDecimal(2) + " | " + rs.getInt(3) + " | " + rs.getInt(4));
				while (rs.next()) {
					System.out.println(rs.getString(1) +" | " + rs.getBigDecimal(2) + " | "+ rs.getInt(3) + " | " + rs.getInt(4));
				} 
			}else System.out.println("La categoria "+categoria+" no existe o no tiene productos bajo m�nimos");
		      
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		 
	}
}
