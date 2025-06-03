//Verificação de Intervalo:
//Escreva um programa que solicite ao usuário um número e verifique se ele está no intervalo de 10 a 20 (inclusive).
package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoDeIntervalo07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		// Verifica se o número está no intervalo de 10 a 20 (inclusive)
		if (numero >= 10 && numero <= 20) {
			System.out.println("O número está dentro do intervalo de 10 a 20.");
		} else {
			System.out.println("O número está fora do intervalo de 10 a 20.");
		}

		scanner.close();
	}
}

