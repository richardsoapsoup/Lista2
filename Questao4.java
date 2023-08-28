import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i < 4; i++) {
            System.out.printf("Digite o %dº numero: ", i);
            int n = numero.nextInt();

            if (n > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior numero é " + maior);
    }
}