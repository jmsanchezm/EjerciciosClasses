package ejercicio1;

/**
 * Método que lleva a cabo operaciones bancarias
 * @author jmmoreno
 *
 */
public class CuentaCorriente {
	/**
	 * Guardará el DNI del cliente
	 */
	String DNI;
	/**
	 * Guardará el nombre del cliente
	 */
	String nombre;
	/**
	 * Guardará el saldo del usuario
	 */
	double saldo;
	
	/**
	 * Constructor con los parámetros DNI y saldo
	 * @param DNI
	 * @param saldo
	 */
	public CuentaCorriente(String DNI, double saldo) {
		super();
		this.DNI = DNI;
		this.saldo = saldo;
	}

	/**
	 * Constructor con todos los atributos como parámetros de entrada
	 * @param dNI
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String dNI, String nombre, double saldo) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	/**
	 * Método con el que el cliente podrá sacar dinero
	 * @param cant
	 */
	public void SacaDinero (double cant) {
		//Si la cantidad de saldo es menor a la que quiere sacar
		if (cant>saldo) {
			//Se le mostrará un mensaje de que no se puede llevar a cabo la operación
			System.out.println("SALDO INSUFICIENTE");
			System.out.println("No es posible llevar a cabo esta operación");
		//En caso contrario	
		}else {
			//Se restará la cantidad solicitada
			saldo-=cant;
			System.out.println("Operación realizada correctamente");
		}
	}
	/**
	 * Método que aumenta el saldo con la cantidad introducida
	 * @param cant
	 */
	public void IngresaDinero (double cant ) {
		//Le sumamos a saldo la cantidad
		saldo+=cant;
		System.out.println("Ingreso realizado correctamente");
	}
	
	/**
	 * Método que mostrará la información del cliente
	 */
	public String toString () {
		String muestraInformacion = nombre + "\n"+
									DNI + "\n" +
									saldo + "euros";
		return muestraInformacion;
	}
	
}
