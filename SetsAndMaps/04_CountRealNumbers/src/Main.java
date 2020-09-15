import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numbersWithKyes = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(x -> Double.parseDouble(x))
                .toArray();


        for (double number : numbers) {
            if (!numbersWithKyes.containsKey(number)) {
                numbersWithKyes.put(number, 1);
            } else {
                numbersWithKyes.put(number, numbersWithKyes.get(number) + 1);
            }

        }
        for ( Double num : numbersWithKyes.keySet()) {
            System.out.printf("%.1f -> %d" + System.lineSeparator(), num, numbersWithKyes.get(num));
        }
    }
}
