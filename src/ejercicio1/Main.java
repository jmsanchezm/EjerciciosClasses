package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		int opcion=3; //Se guardará la opción 
		int cant=20; //Se guardará una cantidad
		
		//Creamos el objeto con los parámetrod del cliente
		CuentaCorriente cuentCorr = new CuentaCorriente ("29634057Y", "Juanma", 80.5);
		
		//Creamos el switch
		switch (opcion) {
		//En el primer caso
		case 1: 
			//Llamamos a la función SacaDinero con el parámetro cant
			cuentCorr.SacaDinero(cant);
		
			break;
		//En el segundo caso
		case 2:
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
		
		
		


	}

}
