package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion;//Se guardará la opcion 
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Solicitamos eleccion
		System.out.println("Hola, ¿qué desea hacer?");
		System.out.println("1. Solicitar un libro");
		System.out.println("2. Devolver un libro");
		//Leemos opcion
		opcion=read.nextInt();
		
		//Creamos el objeto
		Libro lb = new Libro ("Las aventuras de JISUS", "Los evangelios",5,6);
		
		//Mientras que la opcion sea mayor que cero
		while (opcion>0) {
			//Creamos el switch
			switch (opcion) {
			
			//En el primer caso
			case 1:
				//Si la llamada a la funcion nos devuelve true
				if (lb.Prestamo()) {
					//Se le mostrará un mensaje de que se ha prestado
					System.out.println("Libro prestado");
				//En caso contrario, se mostrará que no hay libros suficientes
				}else {
					System.out.println("Libros insuficientes");
					System.out.println("No se ha podido llevar a cabo la opción");
				}
				break;
				
			//En el segundo caso	
			case 2:
				//Si la llamada a la funcion nos devuelve true
				if (lb.Devolucion()) {
					//Nos devolverá el libro
					System.out.println("Libro devuelto");
				//En caso contrario
				}else {
					//Se le mostrará un mensaje de que no se pudo llevar a cabo
					System.out.println("No se pudo devolver el libro puesto ya que no se han prestados");
				}
				break;
			
			// Caso por defecto
			default:
				System.out.println("ERROR");
			}
				System.out.println("¿Desea hacer algo más?");
				opcion=read.nextInt();
		}
		//Cerramos el Scanner 
		read.close();
	}

}
