/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Multiplicacion de dos numeros
 */



package programa4;

public class Multiplicacion {
	public double x;
	public double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

/////////////////////////////////////////////////////////////////

	public Multiplicacion() {

	}

	public Multiplicacion(double x, double y) {
		this.x = x;
		this.y = y;

	}
/////////////////////////////////////////////////////////////////////

	public double getresult() {
		return x * y;
	}

	public void imprimir() {
		System.out.println("La Multiplicacion es:" + this.getresult());
	}

}
