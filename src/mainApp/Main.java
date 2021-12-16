package mainApp;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		int n1Input = Integer.parseInt(scanner.nextLine());
		System.out.print("Escribe el segundo número: ");
		int n2Input = Integer.parseInt(scanner.nextLine());
		
		System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. División");
		System.out.print("Elige la operación que deseas: ");
		int operacionInput = Integer.parseInt(scanner.nextLine());
		
		System.out.println("El resultado es: " + calcular(n1Input, n2Input, operacionInput));
	}
	
	
	private static int suma(int n1, int n2) {
		return n1 + n2;
	}
	
	private static int resta(int n1, int n2) {
		return n1 - n2;
	}
	
	private static int multiplicacion(int n1, int n2) {
		return n1 * n2;
	}
	
	private static int division(int n1, int n2) {
		if (n2 == 0) return 0;
		return n1 / n2;
	}
	
	public static int calcular (int n1, int n2, int operacion) {
		switch (operacion) {
		case 1:
			return suma(n1, n2);
		case 2:
			return resta(n1, n2);
		case 3:
			return multiplicacion(n1, n2);
		case 4:
			return division(n1, n2);
		default:
			break;
		}
		
		return 0;
	}
}
