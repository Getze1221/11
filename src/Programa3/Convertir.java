/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:convierte dolares a pesos
 */



package Programa3;

public class Convertir {
	public double dolares;

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}


////////////////////////////////////////////////////////////////////////////////////////////

	public Convertir() {

	}

	public Convertir(double dolares) {
		this.dolares = dolares;

	}
///////////////////////////////////////////////////////////////////////////////////////////
	public double getresul() {
		return dolares*20;
	}
////////////////////////////////////////////////////////////////////////////////////////////
	public void imprimir() {
		System.out.println("el total de pesos es de:"+ this.getresul());
	}
	
	
	
	
}