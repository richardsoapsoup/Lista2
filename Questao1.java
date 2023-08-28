import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o 1º numero: ");
        double n1 = numero.nextDouble();

        System.out.print("Digite o 2º numero: ");
        double n2 = numero.nextDouble();

        if (n1 > n2) {
            System.out.printf("%f e maior que %f ", n1, n2);
        }
        else {

            System.out.printf("%f e maior que %f ", n2, n1);
        }
    }
}
