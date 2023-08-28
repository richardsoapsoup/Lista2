import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = numero.nextInt();

        if (n >= 0) {
            System.out.printf("O numero %d e positivo", n);
        }else {
            System.out.println("O numero % d e negativo", n);
        }
    }
}
