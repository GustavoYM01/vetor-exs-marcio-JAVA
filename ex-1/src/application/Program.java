package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int lenghtOfVect = 2;
		int vect[] = new int[lenghtOfVect];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Informe um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int j = 0; j < vect.length; j++) {
			System.out.printf("Números informados: %d%n", vect[j]);
		}

		sc.close();
	}

}
