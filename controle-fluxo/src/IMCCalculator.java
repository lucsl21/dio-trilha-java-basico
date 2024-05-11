import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obeso";
        }

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}