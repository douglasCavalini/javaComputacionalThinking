import java.util.Scanner;

public class Funcoes {

    //Exibir o menu
    public static void exibirMenu(){
        System.out.println("Programa calculadora");
        System.out.println("Escolha a operação matemática desejada: " +
                "\n1 Digite os valores: " +
                "\n+ Adição" +
                "\n- Subtração\n* Multiplicação" +
                "\n/ Divisão" +
                "\n0 - Sair\nDigite a opção desejada:");
    }

    //Exibir os resultados
    public static void exibirResultado(double resultado){
        System.out.println(resultado);
    }
    public static void exibirResultado(double resultado, String mensagem){
        System.out.println(mensagem + " = " + resultado);
    }

    //procedimento que soma dois valores
    public static void somar(double num1, double num2){
        double soma = num1 + num2;
        exibirResultado(soma);
    }

    public static void multiplicar(double numero1, double n2){
        exibirResultado(numero1 * n2);
    }
    public static void dividir(double numero1, double numero2){
        if(numero2 > 0){
            double divisao = numero1 / numero2;
            exibirResultado(divisao);
            //System.out.println("Divisão = " + divisao);
        }else
            System.out.println("Não é possivel dividir por zero.");
    }

    public static void main(String[] args) {

        //Procedimentos e funções => Métodos
        //Funções sem retorno ou com retorno

        int numero2;
        double numero1, soma, subtracao, multiplicacao, divisao;
        String operacao;
        //Entrada
        Scanner entrada = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        exibirMenu();
        operacao = leitorTexto.next();
        switch (operacao){
            //soma
            case "+" :
                somar(numero1, numero2);
               // exibirResultado(soma, "Soma");//exibirResultado(15)
               // System.out.println("Soma = " + soma);
                break;
            //subtração
            case "-":
                subtracao = numero1 - numero2;
                exibirResultado(subtracao);
                //System.out.println("Subtração = " + subtracao);
                break;
            case "*":
            case ".":
                multiplicar(numero1, numero2);
               // exibirResultado(multiplicacao, "Multiplicação");
                //System.out.println("Multiplicação = " + multiplicacao);
                break;
            case "/":
                dividir(numero1,numero2);
                break;
            default:
                System.out.println("Opção inválida");
        }


    }
}
