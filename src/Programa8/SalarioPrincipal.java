/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion: principal de salario
 */



package Programa8;

import java.util.Scanner;



public class SalarioPrincipal{
	
	private static Scanner scanner;
	private static Salario salario;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("ingrese el numero de horas trabajadas:");
		double n= scanner.nextDouble();
		salario = new Salario();
		salario.setN(n);
		salario.imprimir();
		
		
		
	}

}