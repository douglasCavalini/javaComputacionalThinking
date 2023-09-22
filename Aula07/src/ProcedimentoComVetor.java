import java.util.Scanner;

public class ProcedimentoComVetor {

    public static int dig1, dig2;
    public static void exibirVetor(double[] prod){
        System.out.println("Valores dos produtos do carrinho: ");
        for(int i =0; i< prod.length; i++){
            System.out.print("Produto[" + i + "] = " + prod[i] + " - ") ;
        }
    }

    //Procedimento = função sem retorno (VOID)
    public static void somarValores(double[] produtos){
        double soma = 0 ;
        for(int i =0; i< produtos.length; i++){
             soma += produtos[i];
        }
        System.out.println("Soma dos produtos do carrinho é: R$" + soma);
    }

    //Função com retorno = especificar o tipo de retorno
    public static double somarValoresComRetorno(double[] produtos){
        double soma = 0 ;
        for(int i =0; i< produtos.length; i++){
            soma += produtos[i];
        }
        return soma;
    }
    public static void calcularDigitoCpf(int[] cpf){
        int soma = 0, fator = 10;
        for(int i =0; i< cpf.length - 2; i++){
            soma += cpf[i] * fator;
            fator--;
        }
        int resto = soma % 11;
        if(resto == 0 || resto == 1)
            dig1=0;
        else
            dig1 = 11 - resto;
    }
    public static void calcular2DigitoCpf(int[] cpf){
        int soma = 0, fator = 11;
        for(int i =0; i< cpf.length - 2; i++){
            soma += cpf[i] * fator;
            fator--;
        }
        soma += dig1 * 2;
        int resto = soma % 11;
        if(resto == 0 || resto == 1)
            dig2=0;
        else
            dig2 = 11 - resto;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] produtos = new double[5];
        int i;
        for(i=0; i < produtos.length; i++){
            System.out.println("Digite o valor do " + (i+1) + " produto: ");
            produtos[i] = leitor.nextDouble();
        }
        exibirVetor(produtos);
        somarValores(produtos); //chamada de um procedimento
        //Função com retorno na chamada eu tenho que tratar este retorno
        System.out.println("Soma dos produtos = " + somarValoresComRetorno(produtos));
        //double s = somarValoresComRetorno(produtos);
        /*int[] cpf = new int[11];
        for(i=0; i < cpf.length; i++){
            System.out.println("Digite o " + (i+1) + " digito do cpf: ");
            cpf[i] = leitor.nextInt();
        }
        calcularDigitoCpf(cpf);
        calcular2DigitoCpf(cpf);

        if(dig1 == cpf[9] && dig2 == cpf[10])
            System.out.println("Cpf é válido");
        else
            System.out.println("Cpf é inválido");

         */
    }
}
