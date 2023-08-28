import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner turno = new Scanner(System.in);
        System.out.print("Digite o turno que voce estuda? (M =Matutino, V = Vespetino, N= Noturno): ");
        char tur = turno.next().charAt(0);

        switch (tur) {
            case 'M':
            case 'm':
                System.out.println("Bom dia");
                break;

            case 'V':
            case 'v':
                System.out.println("Boa tarde");
                break;

            case 'N':
            case 'n':
                System.out.println("Boa noite");
                break;
                
            default:
                System.out.println("Valor invalido!");
        }
    }
}
