import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome e sexo separado por virgula, exemplo Aline-F, João-F");

        List<String> mulheres = Arrays.stream(scanner.nextLine().split(","))
                .map(String::trim)
                .filter(p -> p.endsWith("-F"))
                .map(p -> p.replace("-F", ""))
                .toList();

        mulheres.forEach(System.out::println);


    }

}