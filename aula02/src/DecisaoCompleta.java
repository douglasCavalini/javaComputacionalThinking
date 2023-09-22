import java.util.Scanner;

public class DecisaoCompleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if(idade >= 12) { //Resultado: V ou F
            System.out.println("Bem vindo ao jogo ...");
            System.out.println("Você pode jogar");
        }else{
            System.out.println("Você não pode jogar");
        }
    }
}
