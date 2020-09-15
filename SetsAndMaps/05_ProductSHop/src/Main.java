import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, String>> shops = new TreeMap<>();


        String input = scanner.nextLine();


        while(!input.equals("Revision")) {
            String[] shopsAndProducts = input.split(", ");
            shops.putIfAbsent(shopsAndProducts[0], null);
            shops.
            input = scanner.nextLine();
        }
        System.out.println();
        System.out.println();



    }
}
