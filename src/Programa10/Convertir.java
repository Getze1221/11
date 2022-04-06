/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion: convertir KB A MB
 */

package Programa10;

public class Convertir {
	public double n;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public Convertir() {

	}

	public Convertir(double n) {
		this.n = n;

	}

///////////////////////////////////////////////////////////////////////////////////////////
	public double getresul() {
		return n * 1000;
	}

////////////////////////////////////////////////////////////////////////////////////////////
	public void imprimir() {
		System.out.println("el total de kb es de:" + this.getresul());
	}

}