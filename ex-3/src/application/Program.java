package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int lenghtOfVect = 4;
		double[] vect = new double[lenghtOfVect];
		double sum = 0.0;
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite uma nota: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		for(int j = 0; j < vect.length; j++) {
			sum += vect[j];
		}
		
		double avgSum = sum / vect.length;
		
		System.out.printf("Média das notas: %.2f", avgSum);
		
		
		sc.close();
	}

}
