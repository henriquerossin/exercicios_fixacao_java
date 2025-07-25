import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Exercício 6, Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */

        double A, B, C, a, b, c, d, e;

        System.out.println("Digite três valores: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        a = (A * C) / 2;
        b = Math.PI * Math.pow(C, 2);
        c = ((A + B) * C) / 2;
        d = Math.pow(B, 2);
        e = A * B;

        System.out.printf("a) A área do triângulo retângulo que tem %.2f por base e %.2f por altura é: %.2f \n", A, C, a);

        System.out.printf("b) A área do círculo de raio %.2f é: %.2f \n", C, b);

        System.out.printf("c) A área de um trapézio que tem %.2f e %.2f por bases e %.2f por altura é: %.2f \n", A, B, C, c);

        System.out.printf("d) A área do quadrado que tem lado %.2f é: %.2f \n", B, d);

        System.out.printf("e) A área do retângulo que tem lados %.2f e %.2f é: %.2f \n", A, B, e);

        sc.close();
    }
}