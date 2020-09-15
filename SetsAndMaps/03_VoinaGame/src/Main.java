import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayerDeck = new LinkedHashSet<>();
        Set<Integer> secondPlayerDeck = new LinkedHashSet<>();


        int[] firstCards = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        for (int number : firstCards) {
            firstPlayerDeck.add(number);
        }


        int[] secondCards = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        for (int number : secondCards) {
            secondPlayerDeck.add(number);
        }

        int rounds = 0;
        while (!firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty() && (rounds < 50)) {
            int firstNumber = firstPlayerDeck.iterator().next();
            firstPlayerDeck.remove(firstNumber);

            int secondNumber = secondPlayerDeck.iterator().next();
            secondPlayerDeck.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayerDeck.add(firstNumber);
                firstPlayerDeck.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayerDeck.add(firstNumber);
                secondPlayerDeck.add(secondNumber);
            }
            rounds++;
        }
        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player win!");
        } else if (secondPlayerDeck.size() > firstPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw !");
        }


    }


}
