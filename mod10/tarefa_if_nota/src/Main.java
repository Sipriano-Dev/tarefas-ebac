import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;
        for (int i=0; i<4; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
           soma+= scan.nextInt();
        }

        int media = soma / 4;

        if (media >= 7) {
            System.out.println("MÉDIA: " + media + " - APROVADO!");
        } else if (media >= 5){
            System.out.println("MÉDIA: " + media + " - RECUPERAÇÃO!");
        } else {
            System.out.println("MÉDIA: " + media + " - REPROVADO!");
        }

        scan.close();
    }
}