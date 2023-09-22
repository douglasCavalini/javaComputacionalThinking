import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Efeturar a leitura de 2 vetores com 6 elementos cada.
        //Criar um terceiro vetor com 12 elementos que será a junção dos vetores A e B
        Scanner leitor = new Scanner(System.in);
        int i;
        int[] vetA = new int[6]; //definir o tamanho do vetor
        int[] vetB = new int[6];
        int[] vetC = new int[12];

        //Preencher os vetores
        for(i=0; i<6; i++){
            System.out.println("Digite o " + (i+1) + "ºnúmero do vetor A: ");
            vetA[i] = leitor.nextInt();
        }
        for(i=0; i<6; i++){
            System.out.println("Digite o " + (i+1) + "ºnúmero do vetor B: ");
            vetB[i] = leitor.nextInt();
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
