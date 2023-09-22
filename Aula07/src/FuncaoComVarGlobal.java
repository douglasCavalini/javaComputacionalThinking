import java.util.Scanner;

public class FuncaoComVarGlobal {
    //Variavel global
    public static double numero1;
    public static int numero2;

    public static void lerValores(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
    }
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
    public static void exibirResultado(double resultado) {
        System.out.println(resultado);
    }

    public static void somar(){
        double soma = numero1 + numero2;
        exibirResultado(soma);
    }
    public static void main(String[] args) {
        lerValores();
        exibirMenu();
        Scanner leitorTexto = new Scanner(System.in);
        String operacao = leitorTexto.next();
        switch (operacao) {
            //soma
            case "+":
                somar();
                break;
        }
    }
}
