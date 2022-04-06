/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Clase principal de un cono
 */



package Programa9;

import java.util.Scanner;




public class ConoPrincipal{
	
	private static Scanner scanner;
	private static Cono cono;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("ingrese el radio");
		double n= scanner.nextDouble();
		System.out.println("ingrese la altura");
		double h= scanner.nextDouble();
		cono = new Cono();
		cono.setN(n);
		cono.setH(h);
		cono.imprimir();
		
		
		
	}

}