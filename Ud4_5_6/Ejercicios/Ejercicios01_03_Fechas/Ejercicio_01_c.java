package Ejercicios01_03_Fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio_01_c {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca el dia: ");
		int d=s.nextInt();
		System.out.println("Introduzca el mes: ");
		int m=s.nextInt();
		System.out.println("Introduzca el a�o: ");
		int a=s.nextInt();
		GregorianCalendar fecha= new GregorianCalendar();
		fecha.set(Calendar.DAY_OF_MONTH,d);
		fecha.set(Calendar.MONTH, m-1);
		fecha.set(Calendar.YEAR, a);
//		System.out.println(fecha.get(Calendar.DAY_OF_WEEK)-1);
		
		
		
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==1)
			System.out.println("Lunes");
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==2)
			System.out.println("Martes");
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==3)
			System.out.println("Miercoles");
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==4)
			System.out.println("Jueves");
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==5)
			System.out.println("Viernes");
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==6)
			System.out.println("Sabado");
		if(fecha.get(Calendar.DAY_OF_WEEK)-1==7)
			System.out.println("Domingo");
	
	}

}
