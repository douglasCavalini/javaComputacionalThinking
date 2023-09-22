import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //atribuição => soma = 10;
        //dois valores numéricos - 4 operações
        int numero2;
        double numero1, soma, subtracao, multiplicacao, divisao;

        //Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        //Operadores aritméticos + - * / %(resto da divisao)
        //Processamento
        soma = numero1 + numero2;
        System.out.println("Soma = " + soma);
        subtracao = numero1 - numero2;
        System.out.println("Subtração = " + subtracao);
        multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação = " + multiplicacao);
        divisao = numero1 / numero2;
        System.out.println("Divisão = " + divisao);

    }
}
