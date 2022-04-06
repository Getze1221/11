/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:sacar salario dependiendo de las horas
 */



package Programa8;

public class Salario{
	public double n;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

public Salario() {

}

public Salario(double n) {
	this.n = n;

}
///////////////////////////////////////////////////////////////////////////////////////////
public double getresul() {
	return n*12;
}
////////////////////////////////////////////////////////////////////////////////////////////
public void imprimir() {
	System.out.println("Su salario total en euros por las horas trabajadas es de:"+ this.getresul());
}




}