package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int lenghtOfVect = 4;
		int lenghtOfVect2 = 1;
		int count = 0;
		
		double[] vect1 = new double[lenghtOfVect];
		double[] vect2 = new double[lenghtOfVect];
		double[] vect3 = new double[lenghtOfVect];
		double[] avgVect1 = new double[lenghtOfVect2];
		double[] avgVect2 = new double[lenghtOfVect2];
		double[] avgVect3 = new double[lenghtOfVect2];
		
		double sumVect1 = 0.0;
		double sumVect2 = 0.0;
		double sumVect3 = 0.0;
		
		for(int i = 0; i < vect1.length; i++) {
			System.out.print("Digite a " + (i + 1) + "° nota do 1° aluno: ");
			vect1[i] = sc.nextDouble();
			sc.nextLine();
			sumVect1 += vect1[i];
		}
		
		double avg1 = sumVect1 / vect1.length;
		
		if(avg1 >= 7.0) {
			count++;
		}
		
		for(int j = 0; j < avgVect1.length; j++) {
			avgVect1[j] = avg1;
			System.out.print("Média das notas do 1° aluno: " + avgVect1[j]);
		}
		
		pulaLinha();
//		-----------------------------------------**-----------------------------------------
		
		for(int k = 0; k < vect2.length; k++) {
			System.out.print("Digite a " + (k + 1) + "° nota do 2° aluno: ");
			vect2[k] = sc.nextDouble();
			sc.nextLine();
			sumVect2 += vect2[k];
		}
		
		double avg2 = sumVect2 / vect2.length;
		
		if(avg2 >= 7.0) {
			count++;
		}
		
		for(int l = 0; l < avgVect1.length; l++) {
			avgVect2[l] = avg2;
			System.out.print("Média das notas do 2° aluno: " + avgVect2[l]);
		}
		
		pulaLinha();
//		-----------------------------------------**-----------------------------------------
		
		for(int m = 0; m < vect3.length; m++) {
			System.out.print("Digite a " + (m + 1) + "° nota do 3° aluno: ");
			vect3[m] = sc.nextDouble();
			sc.nextLine();
			sumVect3 += vect3[m];
		}
		
		double avg3 = sumVect3 / vect3.length;
		
		if(avg3 >= 7.0) {
			count++;
		}
		
		for(int n = 0; n < avgVect3.length; n++) {
			avgVect3[n] = avg3;
			System.out.print("Média das notas do 3° aluno: " + avgVect3[n]);
		}
		
		pulaLinha();
		
		System.out.printf("Quantidade de alunos com média igual ou maior a 7: %d", count);
		
		sc.close();
	}
	
	public static void pulaLinha() {
		System.out.printf("%n%n");
	}

}
