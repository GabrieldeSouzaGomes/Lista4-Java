//Verificação de Sinal de Número:
//Escreva um programa que solicite ao usuário um número e verifique se ele é positivo, negativo ou zero
package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoDeSinalDeNumero04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite um número: ");
		double numero = scanner.nextDouble();

		// Verifica o sinal do número
		if (numero > 0) {
			System.out.println("O número é positivo.");
		} else if (numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é zero.");
		}

		scanner.close(); // Fecha o Scanner
	}
}
