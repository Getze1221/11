/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:sacar el iva de una compra
 */



package programa7;

public class Iva {
	private double n;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}
	
//////////////////////////////////////////////////////////////////////////////////
	
	public Iva() {
		
	}
	
	public Iva(double n) {
		this.n=n;
	}
//////////////////////////////////////////////////////////////////////////////////
	public double getresul(){
		return (n*0.16)+n;
		
	}
	
	public void imp() {
		System.out.println("el valor total con iva incluido es de:"+ this.getresul());
	}
	
}
