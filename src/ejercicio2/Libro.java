package ejercicio2;

public class Libro {
	
	String titulo; //Se guardará el nombre del título
	String autor; //Se guardará el nombre del autor
	int ejemplares; // Se guardará el número de ejemplares
	int prestados; //Se guardará el número de ejemplares prestados
	
	/**
	 * Constructor por defecto
	 */
	public Libro() {
		super();
	}

	/**
	 * Contructor con parámetros
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	/**
	 * Método que comprueba y hace un prestamo
	 * @return En caso de que se cumpla la confición, res se volverá 
	 * true y prestados aumentará uno.
	 */
	public boolean Prestamo () {
		boolean res= false; //Se guardará el resultado
		//Si el número de ejemplares es mayor a 0
		if (prestados<ejemplares) {
			//Convertimos a true result
			res=true;
			//Sumamos 1 a prestados
			prestados++;
		}
		//Devolvemos res
		return res;
	}
	
	/**
	 * Método para la devolución, comprobando que haya prestado algún libro
	 * @return Devolverá la true en caso de que se pueda hacer la devolución (true)
	 * En caso de que no haya prestado algún libro, res será false
	 */
	public boolean Devolucion() {
		boolean res=false; //Se guardará el resultado
		
		/*Si el número de presatdo es menor a 0, significará que no
		 * hay ningún ejemplar prestado
		 */
		if (prestados>0) {
			//Por lo que res se volverá false
			res=true;
			//Y restamos 1 a prestados
			prestados--;
		}
		//Devolvemos res
		return res;
		
		
	}
}
