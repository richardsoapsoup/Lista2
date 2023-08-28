public class Questao3 {
    public static void main(String[] args) {
        double nota1 = 8;
        double nota2 = 9;
        double media = (nota1 + nota2) / 2;
        

        if (media >= 7 && media < 10) {
            System.out.println("Aluno aprovado!");

        } else if (media == 10) {
            System.out.println("Aluno aprovado com distincao!");
        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}
