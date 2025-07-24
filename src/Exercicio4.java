import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 4, Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int idFunc;
        int horasTrabalhadas;
        double valorPorHora;

        System.out.println("Digite o id do funcionário, as horas trabalhadas e o valor da hora trabalhada:");
        idFunc = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        double resultado = valorPorHora * horasTrabalhadas;

        System.out.printf("Id do funcionário: %d, salário a receber: R$ %.2f", idFunc, resultado);

        sc.close();
    }
}
