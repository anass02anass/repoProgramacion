package colecciones_I_ejercicios1y2;

public class Main_CD {

	public static void main(String[] args) {
		
		Cancion c1= new Cancion();
		c1.ponAutor("Juanes");
		c1.ponTitulo("Camisa negra");
		Cancion c2= new Cancion("Duncan Dhu","En alg�n lugar");
		Cancion c3= new Cancion("Seguridad Social","Chiquilla");
		
		CD cd1 = new CD();
		cd1.agregaCancion(c1);
		cd1.agregaCancion(c2);
		cd1.agregaCancion(c3);
		int posicion=2;
		System.out.println("El n�mero de canciones introducidas son "+cd1.numeroCanciones());
		System.out.println("La canci�n introducida en la posici�n "+posicion+" es: \n" +cd1.dameCancion(2));
		System.out.println();
		
		
		cd1.eliminaCancion(3);
		System.out.println(cd1);
		
		cd1.grabaCancion(posicion, c3);
		System.out.println(cd1);
	}

}
