package ejercicio4;

public class Articulo {
	/**
	 * Se guardará el nombre del producto
	 */
	String nombre;
	/**
	 * Se guardará el precio del producto sin IVA
	 */
	double precio;
	/**
	 * Constante para el IVA
	 */
	final double IVA=0.21;
	/**
	 * Representa cuántos quedan en el almacén
	 */
	int cuantosQuedan;
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param precio
	 * @param cuantosQuedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		if (precio>0 && cuantosQuedan>=0) {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}else {
			System.out.println("ERROR");
		}
	}
	
	/**
	 * Método que mostrará los artículos por pantalla
	 */
	public String toString () {
		String imprime=nombre + "\t" + precio + "\t" + cuantosQuedan;
		return imprime;
	}
	
	/**
	 * Método que calcula el precio con IVA de un producto
	 * @return Devolverá el precio con el IVA incluido
	 */
	public int getPVP() {
		int precioFinal=0;
		
		precioFinal= (int)((IVA*precio)+precio);
		
		return precioFinal;
		
	}
	/**
	 * Método que aplica un descuento
	 * @param descuento
	 * @return Devuelve el precio con el descuento aplicado
	 */
	public int PVPDescuento (int descuento) {
		int precioDesc;
		descuento=descuento/100;
		precioDesc=(int)((precio*descuento)+precio);
		return precioDesc;
	}
	
	/**
	 * Método que comprueba que la cantidad que solicita se le puede vender
	 * @param cantidad
	 * @return Devolverá si se le puede vender la cantidad o no
	 */
	public boolean vender(int cantidad) {
		boolean result=false;
		//Si la cantidad que solicita es menor a la cantidad que quedan
		if (cantidad<cuantosQuedan){
			//result será igual a true
			result = true;
			cuantosQuedan-=cantidad;
		}
		return result;
	}
	/**
	 * Método que actualizará el objeto al añadirle una cantidad
	 * @param cantidad
	 */
	public void almacenar (int cantidad ) {
		cuantosQuedan+=cantidad;
		System.out.println("Operación efectuada");
	}
}
