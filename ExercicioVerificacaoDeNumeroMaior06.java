//Verificação de Maior Número:
//Escreva um programa que solicite ao usuário três números e verifique qual deles é o maior.
package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoDeNumeroMaior06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.print("Digite o terceiro número: ");
		double num3 = scanner.nextDouble();

		double maior;

		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
		} else {
			maior = num3;
		}

		System.out.println("O maior número é: " + maior);

		scanner.close();
	}
}
