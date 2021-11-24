package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int lenghtOfVect = 5;
		int[] vect = new int[lenghtOfVect];
		double sum = 0.0;
		double mult = 1;
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < vect.length; i++) {
			System.out.print("Informe um número: ");
			vect[i] = sc.nextInt();
		}
		
		for(int j = 0; j < vect.length; j++) {
			sum += vect[j];
		}
		
		for(int k = 0; k < vect.length; k++) {
			mult *= vect[k];
		}
		
		System.out.println();
		
		System.out.println("Números informados: ");
		
		for(int l = 0; l < vect.length; l++) {
			System.out.printf("%d%n",vect[l]);
		}
		
		System.out.printf("Total da somatória: %.2f%n", sum);
		System.out.printf("Total do produto: %.2f", mult);
		
		sc.close();
	}

}
