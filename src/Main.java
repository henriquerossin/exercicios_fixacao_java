import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 1, Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa:

        int a, b;

        System.out.println("Digite dois valores inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int soma = a + b;
        System.out.println("A soma de " + a + " + " + b + " = " + soma);

        sc.close();
    }
}