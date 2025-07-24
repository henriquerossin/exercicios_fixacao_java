import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 2, Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais:

        double r;

        System.out.println("Digite o raio do círculo para calcular a área: ");
        r = sc.nextDouble();

        double area = Math.pow(r, 2.0) * Math.PI;

        System.out.printf("A área de um círculo com o raio de %.2f cm é: %.4f cm.", r, area);

        sc.close();
    }
}
