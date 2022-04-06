/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:area de un rectangulo
 */



package Programa5;


public class Rectangulo {
	private double base;
	private double altura;
	//////////////////////////////////////////////////////////////////////////////////////////
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
//////////////////////////////////////////////////////////////////////////////////////////////
	public Rectangulo() {
		
	}
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	public double getArea() {
		return base *altura;
		
	}
	
	public void imprimir() {
		System.out.println("el area del rectangulo es:"+ this.getArea());
	}
	
}