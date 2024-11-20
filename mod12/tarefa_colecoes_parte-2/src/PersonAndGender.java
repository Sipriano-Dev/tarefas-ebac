import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonAndGender {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Character> men = new HashMap<>();
        Map<String, Character> women = new HashMap<>();


        System.out.print("How many entries will you type: ");
        int n = scan.nextInt();

        for (int i=0; i<n; i++) {
            scan.nextLine();
            System.out.print("Type the " + (i+1) + "º name: ");
            String name = scan.nextLine().strip();
            System.out.print("type the gender F or M: ");
            Character gender = scan.next().strip().charAt(0);

            if ('M' == gender) {
                men.put(name, gender);
            } else {
                women.put(name, gender);
            }

        }

        System.out.println("-----------------------");
        System.out.println("Men's list:");
        men.forEach((key, value) -> System.out.println("name: " + key + ", Gender: " + value));

        System.out.println("Women's list:");
        women.forEach((key, value) -> System.out.println("name: " + key + ", Gender: " + value));


        scan.close();
    }
}