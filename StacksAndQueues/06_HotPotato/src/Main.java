import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");

        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : children) {
            queue.offer(child);
        }
        int round = 1;
        while (queue.size() > 1) {
            String child = queue.poll();
            if (round % n == 0) {
                System.out.println("Removed " + child);
            } else {
                queue.offer(child);
            }
            round++;
        }

        System.out.println("Last is " + queue.poll());

    }
}
