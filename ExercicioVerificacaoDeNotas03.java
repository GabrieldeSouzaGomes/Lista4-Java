//Verificação de Nota:
//Escreva um programa que solicite ao usuário uma nota de 0 a 100 e exiba se ele foi aprovado (nota >= 60) ou reprovado.

package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoDeNotas03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite a nota do aluno (0 a 100): ");
		int nota = scanner.nextInt();

		// Verifica se a nota está dentro do intervalo permitido
		if (nota < 0 || nota > 100) {
			System.out.println("Nota inválida. Digite um valor entre 0 e 100.");
		} else {
			if (nota >= 60) {
				System.out.println("Aluno aprovado!");
			} else {
				System.out.println("Aluno reprovado.");
			}
		}

		scanner.close(); // Fecha o Scanner
	}
}
