package ejercicio3;

public class Punto {
	/**
	 * Se guardará la coordenada del eje x
	 */ 
	int x;
	/**
	 * Se guardará la coordenada del eje y
	 */
	int y; 
	
	/**
	 * Constructor con parámetros
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * Método que imprime las coordenadas de un punto
	 * @return Devuelve el valor de imprime
	 */
	public String toString () {
		String imprime = "(" + x + ", "+ y+")";
		return imprime;
	}
	/**
	 * Método que modifica las coordenadas
	 * @param x
	 * @param y
	 */
	public void SetXY (int x, int y ) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Método que desplaza un punto sumando sus coordenadas
	 * @param dx
	 * @param dy
	 */
	public void desplaza (int dx,int dy) {
		x+=dx;
		y+=dy;
		System.out.println("(" + x + ", "+ y+")");
	}
	
	/**
	 * Método que calcula la distancia entre dos puntos
	 * @param p
	 */
	public int distancia (Punto p) {
		int distancia;
		distancia= (int)Math.sqrt(((p.x-x)*(p.x-x))+((p.y-y)*(p.y-y)));
		return distancia;
	}
}
