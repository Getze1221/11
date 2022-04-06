/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Convierte los dolares a pesos
 */




package Programa2;

public class Convertir {
	public double pesos;

	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}


////////////////////////////////////////////////////////////////////////////////////////////

	public Convertir() {

	}

	public Convertir(double pesos) {
		this.pesos = pesos;

	}
///////////////////////////////////////////////////////////////////////////////////////////
	public double getresul() {
		return pesos*0.050;
	}
////////////////////////////////////////////////////////////////////////////////////////////
	public void imprimir() {
		System.out.println("el total de dolares es de:"+ this.getresul());
	}
	
	
	
	
}
