import java.util.Scanner;

public class DecisaoEncadeada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, inss, salarioLiquido;
        System.out.println("Digite seu salário: R$");
        salario = entrada.nextDouble();
        if(salario <= 1302){
            inss = salario * 0.075;
            salarioLiquido = salario-inss;
            System.out.println("Salario R$ " + String.format("%.2f", salario)
                              + "\nAlíquota: 7.5% - Desconto: R$ " + String.format("%.2f", inss)
                              + "\nSalário líquido: R$ " + String.format("%.2f", salarioLiquido));
        }else if(salario <= 2571.29){
            inss = salario * 0.09;
            salarioLiquido = salario-inss;
            System.out.println("Salario R$ " + String.format("%.2f", salario)
                    + "\nAlíquota: 9% - Desconto: R$ " + String.format("%.2f", inss)
                    + "\nSalário líquido: R$ " + String.format("%.2f", salarioLiquido));
        }else if(salario <= 3856.94){
            inss = salario * 0.12;
            salarioLiquido = salario-inss;
            System.out.println("Salario R$ " + String.format("%.2f", salario)
                    + "\nAlíquota: 12% - Desconto: R$ " + String.format("%.2f", inss)
                    + "\nSalário líquido: R$ " + String.format("%.2f", salarioLiquido));
        }else if(salario <= 7507.49){
            inss = salario * 0.14;
            salarioLiquido = salario-inss;
            System.out.println("Salario R$ " + String.format("%.2f", salario)
                    + "\nAlíquota: 14% - Desconto: R$ " + String.format("%.2f", inss)
                    + "\nSalário líquido: R$ " + String.format("%.2f", salarioLiquido));
        }else{
            inss = 877.24;
            salarioLiquido = salario-inss;
            System.out.println("Salario R$ " + String.format("%.2f", salario)
                    + "\nAlíquota: 877.24 - Desconto: R$ " + String.format("%.2f", inss)
                    + "\nSalário líquido: R$ " + String.format("%.2f", salarioLiquido));
        }

    }
}
