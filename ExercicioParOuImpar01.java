//Verificação de Número Par ou Ímpar:
//Escreva um programa que solicite ao usuário um número inteiro e verifique se ele é par ou ímpar.
package lista04;

import java.util.Scanner;

public class ExercicioParOuImpar01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		// Verifica se é par ou ímpar
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR.");
		} else {
			System.out.println("O número " + numero + " é ÍMPAR.");
		}

		scanner.close(); // Fecha o Scanner
	}
}

