/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:principal de  triangulo
 */


package programa6;


import java.util.Scanner;

public class TrianguloPrincipal {
	private static Scanner scanner;
    private static Triangulo rectangulo;
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("ingrese la base1:");
		double base= scanner.nextDouble();
		System.out.println("dabe la altura1:");
		double altura= scanner.nextDouble();
		rectangulo= new Triangulo();
		rectangulo.setBase(base);
		rectangulo.setAltura(altura);
		rectangulo.imprimir();
		
		

	}
}
