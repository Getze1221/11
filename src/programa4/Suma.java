package programa4;

public class Suma {
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

	public Suma() {

	}

	public Suma(double x, double y) {
		this.x = x;
		this.y = y;

	}
/////////////////////////////////////////////////////////////////////

	public double getresult() {
		return x + y;
	}

	public void imprimir() {
		System.out.println("La suma es:" + this.getresult());
	}

}
