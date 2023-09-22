import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Efetuar a leitura de 5 elementos em um vetor.
        //Ordenar o vetor e exíbi-lo;
        Scanner leitor = new Scanner(System.in);
        int i, aux;
        //Declarando um vetor de inteiros com 5 posições:
        int[] vetor = new int[5];
        //Efetuando a leitura dos elementos do vetor:
        for(i=0; i<5; i++){
            System.out.println("Digite o " + (i+1) + "º elemento do vetor: ");
            vetor[i] = leitor.nextInt();
        }
        //Ordenando o vetor
        for (i=0; i<5; i++){
            for(int j = i+1; j<5; j++){
                if(vetor[i]> vetor[j]){ //1ª volta=> 5 > 8
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for(i=0; i<5; i++)
            System.out.println(vetor[i]);
    }
}
