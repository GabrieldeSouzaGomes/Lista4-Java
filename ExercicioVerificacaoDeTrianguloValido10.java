//Verificação de Triângulo Válido:
//Escreva um programa que solicite ao usuário os comprimentos dos três lados
//de um triângulo e verifique se eles formam um triângulo válido.
package lista04;

import java.util.Scanner;

public class ExercicioVerificacaoDeTrianguloValido10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos lados do triângulo
        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        // Verificação da validade do triângulo
        if (lado1 + lado2 > lado3 &&
            lado1 + lado3 > lado2 &&
            lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo válido.");
        }

        scanner.close();
    }
}
