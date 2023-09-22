import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        //Saída de dados
        System.out.println("Bem vindo!"); //sout
        //System.out.println("Andre");

        //Variável de memória: Um espaço na memória Ram para armazenar uma informação
        //Tem que ter um tipo (tipo da informação: texto, número inteiro, número real, lógico
        //Nome: começar com letra, não conter caracteres especiais (_)
        //camelCase: nomeDoAluno  | snackCase: nome_do_aluno | salario | mediaSalarial | numero1 n1/num1
        //declaração de variáveis
        //tipo nome;
        int quantidadeFilhos; //int => número inteiro
        double altura; //double => número real
        boolean temIngles; // boolean => lógico (V|F)
        char letra; // char => caractere (a)(4)
        String nome = "Eliane"; // String => texto


        //Declarando um objeto que realizará a leitura
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine(); //Faz a leitura de textos
        System.out.println("Bem vinda(o) " + nome + "!"); //O mais dentro da saída de dados concatena textos (juntar)

        System.out.println("Digite quantos filhos você tem: ");
        quantidadeFilhos = entrada.nextInt();

    }
}
