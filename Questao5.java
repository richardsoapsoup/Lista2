import java.util.Scanner;

public class MyCkass {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i < 4; i++) {
            System.out.printf("Digite o %dº numero: ", i);
            int n = numero.nextInt();

            if (n > maior); {
                maior = n;
            }
            if (n < menor){
                menor = n;
            }
        }
        System.out.printf("Maior numero = %d \n", maior);
        System.out.printf("Menor numero = %d \n", menor);
    }
}