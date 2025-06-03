//Verificação de Divisibilidade: 
//Escreva um programa que solicite ao usuário um número e verifique se ele é divisível por 3 e por 5.
package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoDivisibilidade08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		// Verifica se é divisível por 3 e por 5
		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("O número " + numero + " é divisível por 3 e por 5.");
		} else {
			System.out.println("O número " + numero + " NÃO é divisível por 3 e por 5 ao mesmo tempo.");
		}
	}
}