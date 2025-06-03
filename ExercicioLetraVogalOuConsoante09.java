//Verificação de Letra Vogal ou Consoante:
//Escreva um programa que solicite ao usuário uma letra e verifique se ela é uma vogal ou uma consoante.

package lista04;

import java.util.Scanner;

public class ExercicioLetraVogalOuConsoante09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		String entrada = scanner.next().toLowerCase();

		if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
			System.out.println("Entrada inválida. Digite apenas uma letra.");
		} else {
			char letra = entrada.charAt(0);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("A letra '" + letra + "' é uma vogal.");
			} else {
				System.out.println("A letra '" + letra + "' é uma consoante.");
			}
		}

		scanner.close();
	}
}

