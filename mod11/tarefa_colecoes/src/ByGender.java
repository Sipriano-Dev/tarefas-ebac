import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ByGender {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type names and gender separated by comma, example: Anderson-M, Alice-F");
        String namesAndGender = scan.nextLine();

        Map<String, String> men = new HashMap<>();
        Map<String, String> women = new HashMap<>();

        String[] namesVet = namesAndGender.split(",");
        for (String s : namesVet) {
            String[] aux = s.strip().split("-");
            if ("F".equals(aux[1])) {
                women.put(aux[0], aux[1]);
            } else {
                men.put(aux[0], aux[1]);
            }

        }

        printNames(men);
        System.out.println("--------------");
        printNames(women);


        scan.close();
    }

    private static void printNames(Map<String, String> person) {
        person.forEach((key, value) -> System.out.println("Name: " + key + ", " + "Gender: " + value));
    }


}
