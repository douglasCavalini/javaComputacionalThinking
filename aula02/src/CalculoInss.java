import java.util.Scanner;

public class CalculoInss {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, inss, salarioLiquido;
        String aliquota;
        System.out.println("Digite seu salário: R$");
        salario = entrada.nextDouble();
        if(salario <= 1302){
            inss = salario * 0.075;
            aliquota = "7.5%";
        }else if(salario <= 2571.29){
            inss = salario * 0.09;
            aliquota = "9.0%";
        }else if(salario <= 3856.94){
            inss = salario * 0.12;
            aliquota = "12%";
        }else if(salario <= 7507.49){
            inss = salario * 0.14;
            aliquota = "14%";
        }else{
            inss = 877.24;
            aliquota = "877,24";
        }

        salarioLiquido = salario-inss;
        System.out.println("Salario R$ " + String.format("%.2f", salario)
                + "\nAlíquota: " + aliquota + " - Desconto: R$ " + String.format("%.2f", inss)
                + "\nSalário líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
}
