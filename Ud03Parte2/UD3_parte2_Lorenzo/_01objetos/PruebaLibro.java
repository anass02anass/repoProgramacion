package _01objetos;

public class PruebaLibro {

	public static void main(String[] args) {
		Libro l1 = new Libro ();
		l1.setAutor("Lorenzo");
		Libro l2 = new Libro ("1111", "T�tulo 1", "Autor 1", 111);
		System.out.println(l2.getTitulo());
		System.out.println(l1);
		System.out.println(l1.prestar());
		System.out.println(l1);
	}

}
