package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int lenghtOfVect = 2;
		int[] vect = new int[lenghtOfVect];
		int[] par = new int[lenghtOfVect];
		int[] impar = new int[lenghtOfVect];
		int qtdPar = 0;
		int qtdImpar = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Informe um número: ");
			vect[i] = sc.nextInt();
			sc.nextLine();

			if (vect[i] % 2 == 0) {
				par[qtdPar] = vect[i];
				qtdPar++;
			} else {
				impar[qtdImpar] = vect[i];
				qtdImpar++;
			}
		}

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Número: %d%n", vect[i]);
		}

		for (int i = 0; i < par.length; i++) {
//			System.out.printf("Pares: %d%n", par[i]);
			if (par[i] > 0) {
				System.out.printf("Pares: %d%n", par[i]);
			}
		}

		for (int i = 0; i < impar.length; i++) {
//			System.out.printf("Ímpares: %d%n", impar[i]);
			if (impar[i] > 0) {
				System.out.printf("Ímpares: %d%n", impar[i]);
			}
		}

		sc.close();
	}

}
