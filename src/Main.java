import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Exercício 1, Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa:

        int a, b;

        System.out.println("Digite dois valores inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int soma = a + b;
        System.out.println("A soma de " + a + " + " + b + " = " + soma);
        */

        /*
        Exercício 2, Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais:

        double r;

        System.out.println("Digite o raio do círculo para calcular a área: ");
        r = sc.nextDouble();

        double area = Math.pow(r, 2.0) * Math.PI;

        System.out.printf("A área de um círculo com o raio de %.2f cm é: %.4f cm.", r, area);
        */

        /*
        Exercício 3, Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D):

        int A, B, C, D;

        System.out.println("Digite quatro valores inteiros: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("A diferença entre " + A + " * " + B + " - " + C + " * " + D + " = " + diferenca);
        */

        /*
        Exercício 4, Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int idFunc;
        int horasTrabalhadas;
        double valorPorHora;

        System.out.println("Digite o id do funcionário, as horas trabalhadas e o valor da hora trabalhada:");
        idFunc = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        double resultado = valorPorHora * horasTrabalhadas;

        System.out.printf("Id do funcionário: %d, salário a receber: R$ %.2f", idFunc, resultado);
        */





        sc.close();
    }
}