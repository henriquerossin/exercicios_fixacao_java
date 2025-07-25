import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 5, Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago:

        int idPeca1, qtdPecas1, idPeca2, qtdPecas2;
        double valorPeca1, valorPeca2, resultado;

        System.out.println("Digite o código da peça 1, quantas peças 1 está levando e depois o valor da peça 1:");
        idPeca1 = sc.nextInt();
        qtdPecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        System.out.println("Agora, o código da peça 2, quantas peças 2 está levando e o valor da peça 2:");
        idPeca2 = sc.nextInt();
        qtdPecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        resultado = qtdPecas1 * valorPeca1 + qtdPecas2 * valorPeca2;

        System.out.printf("Valor total a ser pago: R$ %.2f", resultado);

        sc.close();
    }
}
