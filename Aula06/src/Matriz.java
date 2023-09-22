import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][2]; //tamanho 6 elementos
        int linha, coluna;

        for(linha = 0; linha < 3; linha++){
            for(coluna = 0; coluna<2; coluna++) {
                System.out.println("Digite o ["+ linha + "]["+ coluna + "] elemento da matriz");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        for(linha = 0; linha < 3; linha++){
            for(coluna = 0; coluna<2; coluna++) {
                System.out.println("Matriz ["+ linha + "]["+ coluna + "] = " + matriz[linha][coluna]);
            }
        }

    }
}
