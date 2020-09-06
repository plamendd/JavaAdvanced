
import java.util.ArrayDeque;
import java.util.Scanner;
/* Create a simple calculator that can evaluate simple expressions that will not hold any operator different from addition and subtraction. There will not be parentheses or operator precedence.
Solve the problem using a Stack.
Examples
Input	Output
2 + 5 + 10 - 2 - 1	14
2 - 2 + 5	5 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque();

        String input = scanner.nextLine();
        String[] splitedInput = input.split(" ");


        while (true) {
            for (int i = 0; i < splitedInput.length; i++) {
                stack.push(splitedInput[i]);
                if (stack.size() == 3) {
                    Integer second = Integer.parseInt(stack.pop());
                    String operator = stack.pop();
                    Integer first = Integer.parseInt(stack.pop());
                    Integer result = 0;

                    if (operator.equals("+")) {
                        result = first + second;
                    } else {
                        result = first - second;
                    }
                    stack.push(result.toString());
                }
            }
            System.out.println(stack.pop());
            if (stack.isEmpty()) {
                break;
            }
        }

    }
}
