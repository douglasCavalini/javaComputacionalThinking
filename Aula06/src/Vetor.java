import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i;
        //Declarando vetores
        double[] notas = new double[5];
        String[] nomes = {"Eliane", "Luana", "Shelly", "Lucas", "Neverton"};
        double soma =0;
        //Preencher vetor
        for(i=0; i<notas.length; i++) {
            System.out.println("Digite a nota do(a) aluno(a) " + nomes[i]);
            notas[i] = leitor.nextDouble();
        }
        for(i=0; i<5; i++){
            soma += notas[i];
        }
        System.out.println("Soma das notas: " + soma);
        double media = soma /notas.length;
        for(i =0; i<=4; i++)
           System.out.println(nomes[i]  + " - nota: " + notas[i]);



    }

}
