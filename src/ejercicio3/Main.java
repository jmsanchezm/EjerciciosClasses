package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		int x=2;
		int y=9;
		
		Punto punt= new Punto (x,y);
		Punto punt2=new Punto (1,1);
		
		System.out.println(punt2.distancia(punt));
		
		punt.desplaza(x, y);

	}

}
