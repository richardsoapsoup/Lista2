import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        System.out.print("Quanto voce ganha por hora: ");
        double valor = salario.nextDouble();
        System.out.print("Quantas horas voce trabalha por mes? ");
        double horas = salario.nextDouble();
        double salarioBruto = valor * horas;
        double descontoI = 0;
        double descontoN = 0.1;
        double descontoF = 0.11;

        if (salarioBruto <= 900) {
            System.out.println("Isento");

        } else if (salarioBruto <= 1500) {
            descontoI = 0.05;

        } else if (salarioBruto <= 2500) {
            descontoI = 0.1;

            }else {
            descontoI = 0.2;
        }
        double calculoI = salarioBruto * descontoI;
        double calculoN = salarioBruto * descontoN;
        double salarioLiquido = salarioBruto - calculoI - calculoN;
        double totalDesconto = calculoI + calculoN;
        double empresaDeposita = salarioBruto * descontoF;

        System.out.println("O salario bruto é R$ " + salarioBruto);
        System.out.println("O valor descontado do Imposto de Renda é R$ " + calculoIr);
        System.out.println("O valor descontado do INSS é R$ " + calculoInss);
        System.out.println("O valor do FGTS que a empresa deposita é R$ " + empresaDeposita);
        System.out.println("O Total de desconto é R$ " + totalDesconto);
        System.out.println("O Seu salário líquido é R$ " + salarioLiquido);
    }
}
