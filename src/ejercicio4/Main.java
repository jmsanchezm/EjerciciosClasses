package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int descuento;
		int cant;
		int opcion;
	
		Scanner read=new Scanner (System.in);
	
		Articulo art= new Articulo ("Arazules",0.15,20);
		
		System.out.println("1. Vender");
		System.out.println("2. Almacenar");
		System.out.println("3. Aplicar descuento");
		System.out.println("4. Mostrar producto");
		System.out.println("Seleccione una opcion");
		opcion=read.nextInt();
		
		while (opcion>0) {
			switch (opcion) {
			case 1:
				System.out.println("¿Qué cantidad desea vender?");
				cant=read.nextInt();
				if (art.vender(cant)) {
					System.out.println("Venta realizada");
				}else {
					System.out.println("No queda en stock");
				}
				break;
			case 2:
				System.out.println("¿Qué cantidad desea almacenar?");
				cant=read.nextInt();
				art.almacenar(cant);
				System.out.println("Operación efectuada correctamente");
				break;
				
			case 3:
				System.out.println("¿De cuánto es el descuento?");
				descuento=read.nextInt();
				art.PVPDescuento(descuento);
				break;
			case 4:
				art.toString();
				break;
			default:
				System.out.println("ERROR");
			}
			System.out.println("1. Vender");
			System.out.println("2. Almacenar");
			System.out.println("3. Aplicar descuento");
			System.out.println("4. Mostrar producto");
			System.out.println("Seleccione una opcion");
			opcion=read.nextInt();
		}

	}

}
