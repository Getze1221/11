/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:resta de dos numeros
 */



package programa4;

public class Resta {

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

	public Resta() {

	}

	public Resta(double x, double y) {
		this.x = x;
		this.y = y;

	}
/////////////////////////////////////////////////////////////////////

	public double getresult() {
		return x - y;
	}

	public void imprimir() {
		System.out.println("La resta es:" + this.getresult());
	}

}
