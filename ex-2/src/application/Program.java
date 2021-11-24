package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int lenghtOfVect = 10;
		double [] vect = new double[lenghtOfVect];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		System.out.printf("Números mostrados na ordem inversa: %n");
		
		for(int j = vect.length - 1; j >= 0; j--) {
			System.out.printf("Números informados: %.2f%n", vect[j]);
		}
		
		sc.close();
	}

}
