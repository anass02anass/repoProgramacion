package ejercicio2;

import java.sql.SQLException;

public class ControlAccesoJava {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		AccesoBdatosUsu abd = new AccesoBdatosUsu();
		abd.conectar();
		System.out.println(abd.compruebaContrase�a("Belen","67890"));
		
		abd.desconectar();

	}

}
