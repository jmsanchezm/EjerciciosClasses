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
}
