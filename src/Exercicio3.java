import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 3, Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D):

        int A, B, C, D;

        System.out.println("Digite quatro valores inteiros: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("A diferença entre " + A + " * " + B + " - " + C + " * " + D + " = " + diferenca);

        sc.close();
    }
}
