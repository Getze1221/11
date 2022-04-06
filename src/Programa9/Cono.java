/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Sacar volumen de un cono
 */



package Programa9;

public class Cono{
	public double n;
	public double h;

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

public Cono() {

}

public Cono(double n, double h) {
	this.n = n;
	this.h = h;

}
///////////////////////////////////////////////////////////////////////////////////////////
public double getresul() {
	return (3.1416*(n*n)*h)/3;
}
////////////////////////////////////////////////////////////////////////////////////////////
public void imprimir() {
	System.out.println("El volumne del cono es de:"+ this.getresul());
}




}