package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int opcion; //Se guardará la opción 
		int cant; //Se guardará una cantidad
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Solicitamos opcion
		System.out.println("¿Qué desea hacer?");
		System.out.println("1. Sacar dinero");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Mostrar mi información");
		//Leemos opcion
		opcion=read.nextInt();
		
		//Creamos el objeto con los parámetros del cliente
		CuentaCorriente cuentCorr = new CuentaCorriente ("29634057Y", "Juanma", 80.5);
		
		//Mientras que la elección sea mayor que 0
		while (opcion>0) {
		//Creamos el switch
		switch (opcion) {
		
		//En el primer caso
		case 1: 
			System.out.println("¿Cuánto desea sacar?");
			cant= read.nextInt();
			//Llamamos a la función SacaDinero con el parámetro cant
			cuentCorr.SacaDinero(cant);
			break;
			
		//En el segundo caso
		case 2:
			System.out.println("¿Qué cantidad desea ingresar?");
			cant=read.nextInt();
			//Llamamos a la función IngresaDinero con el parámetro cant
			cuentCorr.IngresaDinero(cant);
			break;
			
		//En el tercer caso 
		case 3:
			//Mostraremos el contenido de la función toString 
			System.out.println(cuentCorr.toString());
			break;
			
		//Como predeterminado
		default:
			//Se le mostrará error
			System.out.println("ERROR");
		}
		//Solitamos si desea hacer algo más
		System.out.println("¿Desea hacer alguna operación más?");
		//Leemos opcion
		opcion=read.nextInt();
		}
		
		//Cerramos el Scanner
		read.close();


	}

}
