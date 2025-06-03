//Verificação de Ano Bissexto:
//Escreva um programa que solicite ao usuário um ano e verifique se ele é bissexto
package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoAnoBissexto05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		int ano = scanner.nextInt();

		// Verificação de ano bissexto
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é bissexto.");
		}

		scanner.close();
	}
}
