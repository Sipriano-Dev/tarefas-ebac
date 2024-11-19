import java.util.*;
/* Professor, eu coloco em inglês e faço outros exemplos, não é pra me exibir nem nada assim
é pra colocar em prática meus conhecimentos, pra não esquecer, obg.
 */

public class NaturalOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type names separated by comma: ");
        String names = scan.nextLine();
        String names2 = names; //Strings diferentes, pq a ordenação afeta o resultado do outro método

        printByNaturalOrder(names);
        System.out.println("-------------------------");
        printByNaturalOrderLessCode(names2);

        scan.close();
    }


    private static void printByNaturalOrder(String names) {
        String[] arrayNames = names.split(",");
        List<String> listNames = new ArrayList<>();
        listNames = Arrays.asList(arrayNames);
        listNames = listNames.stream().map(String::strip).sorted().toList();
        listNames.forEach(System.out::println);
    }

    private static void printByNaturalOrderLessCode(String names2) {
        //TreeSet Already has natural order, you can use hashset too(2), or a regular list(3)
        new HashSet<>(Arrays.asList(names2.split(","))).stream().map(String::strip).sorted().forEach(System.out::println);
        //Arrays.stream(names2.split(",")).map(String::strip).sorted().toList().forEach(System.out::println);
    }


}