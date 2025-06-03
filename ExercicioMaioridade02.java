//Verificação de Maioridade:
// Escreva um programa que solicite ao usuário sua idade e verifique se ele é maior de idade (18 anos ou mais).
package lista04;

import java.util.Scanner;

public class ExercicioMaioridade02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();

		// Verifica se é maior de idade
		if (idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}

		scanner.close(); // Fecha o Scanner
	}
}
