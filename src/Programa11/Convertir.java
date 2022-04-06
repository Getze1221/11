/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Convertir de MB a KB
 */

package Programa11;

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
		return n / 1000;
	}

////////////////////////////////////////////////////////////////////////////////////////////
	public void imprimir() {
		System.out.println("el total de MB es de:" + this.getresul());
	}

}