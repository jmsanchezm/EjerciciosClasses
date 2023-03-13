package ejercicio2;

public class Libro {
	
	String titulo[]=new String[0]; //Se guardará el nombre del título
	String autor[]=new String[0]; //Se guardará el nombre del autor
	int ejemplares[]= new int [0]; // Se guardará el número de ejemplares
	int prestados[]=new int [0]; //Se guardará el número de ejemplares prestados
	
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
	public Libro(String titulo[], String autor[], int ejemplares[], int prestados[]) {
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
		if (ejemplares>0) {
			//Convertimos a true result
			res=true;
			//Sumamos 1 a prestados
			prestados++;
		}
		//Devolvemos res
		return res;
	}
	
	public boolean Devolucion() {
		if ()
	}
}
