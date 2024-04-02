import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers will be entered?");
        int n = scan.nextInt();

        int sum = 0;
        for (int i=0; i<n; i++) {
            System.out.println("Enter the " + (i+1) + "° number");
            sum+= scan.nextInt();
        }
        System.out.println("The average is: " + sum / n);
    }
}
