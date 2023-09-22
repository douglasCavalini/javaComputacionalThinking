import java.util.Scanner;

public class Execicio1_V2 {
    public static void main(String[] args) {
        //Efeturar a leitura de 2 vetores com 6 elementos cada.
        //O vetor A só deverá aceitar elementos pares e o vetor B apenas elementos ímpares
        //Criar um terceiro vetor com 12 elementos que será a junção dos vetores A e B
        Scanner leitor = new Scanner(System.in);
        int i, numero;
        int[] vetA = new int[6]; //definir o tamanho do vetor
        int[] vetB = new int[6];
        int[] vetC = new int[12];

        //Preencher os vetores
        i=0;
        while (i < 6){
            System.out.println("Digite o " + (i+1) + "ºnúmero do vetor A, por favor informe um número par: ");
            numero = leitor.nextInt();
            if(numero % 2 == 0) {
                vetA[i] = numero;
                i++;
            }
        }
        i=0;
        while (i < 6){
            System.out.println("Digite o " + (i+1) + "ºnúmero do vetor B, por favor informe um número ímpar: ");
            numero = leitor.nextInt();
            if(numero % 2 != 0) {
                vetB[i] = numero;
                i++;
            }
        }
        for(i=0; i<6; i++){
            vetC[i] = vetA[i];
            vetC[i+6] = vetB[i];
        }
        System.out.println("Exibindo o vetor C");
        for(i=0; i<12; i++)
            System.out.println(vetC[i]);
    }
}
