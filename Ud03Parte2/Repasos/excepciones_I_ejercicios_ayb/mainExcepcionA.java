package excepciones_I_ejercicios_ayb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainExcepcionA {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero entero: ");
		try{
			int entero= s.nextInt();}
		catch (InputMismatchException ime) {
			System.out.println("La inserci�n no es un entero");
//			System.out.println(ime.getMessage());
		}
	}

}
