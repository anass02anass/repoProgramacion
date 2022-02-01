package _02colecciones1;

public class Libro {

	private String titulo;
	private Persona autor;
	private String ISBN;
	private int paginas;
	private int edicion;
	private String editorial;
	private String lugar;
	private Fecha fechaEdicion;
	
	//Constructores
	
	public Libro() {
		titulo = "";
		autor = new Persona();
		ISBN = "";
		paginas = 0;
		edicion = 0;
		editorial = "";
		lugar = "";
		fechaEdicion = new Fecha();
	}
	
	public Libro(String titulo, Persona autor, String iSBN, int paginas, int edicion, String editorial, String lugar,
			Fecha fechaEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.paginas = paginas;
		this.edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.fechaEdicion = fechaEdicion;
	}
	
	//Getters y Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Fecha getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(Fecha fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	
	//Creando leer...
	
	public void leer() {
		System.out.println("Introduce el t�tulo: ");
		titulo = MyInput.readString();
		System.out.println("Introduce el nombre del autor: ");
		autor.ponNombre(MyInput.readString());
		System.out.println("Introduce los apellidos del autor: ");
		autor.ponApellidos(MyInput.readString());
		System.out.println("Introduce el isbn: ");
		ISBN = MyInput.readString();
		System.out.println("Indica el n�mero de p�ginas: ");
		paginas = MyInput.readInt();
		System.out.println("Indica la edici�n: ");
		edicion = MyInput.readInt();
		System.out.println("Indica la editorial: ");
		editorial = MyInput.readString();
		System.out.println("Indica el lugar de edici�n: ");
		lugar = MyInput.readString();
		System.out.println("Fecha edici�n: ");
		fechaEdicion.leer();
	}
	
	//ToStrings...
	
	public String toString() {
		return ("T�tulo: " + titulo + "\n" + edicion + "a. edici�n\nAutor: "+autor.nombreCompleto()+"\nISBN: "+ISBN+
				"\n"+lugar+", "+fechaEdicion+"\n"+paginas+" p�ginas");
	}
}
