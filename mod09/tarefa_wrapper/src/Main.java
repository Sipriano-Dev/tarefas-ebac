import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        Integer numWrapper = num;
        System.out.println("Wrapper: " + numWrapper);

        scan.close();
    }
}