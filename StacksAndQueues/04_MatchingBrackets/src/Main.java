import java.util.ArrayDeque;
import java.util.Scanner;

/*
We are given an arithmetical expression with brackets. Scan through the string and extract each sub-expression.
Print the result back at the terminal.
Examples
Input	Output
1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5	(2 + 3)
(3 + 1)
(2 - (2 + 3) * 4 / (3 + 1))
(2 + 3) - (2 + 3)	(2 + 3)
(2 + 3)
Hints
Use a stack, namely an ArrayDeque()
Scan through the expression searching for brackets
oIf you find an opening bracket, push the index into the stack
oIf you find a closing bracket pop the topmost element from the stack. This is the index of the opening bracket.
Use the current and the popped index to extract the sub-expression
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque();

        for (int i = 0; i < input.length(); i++) {
            String expression = "";
            char checked = input.charAt(i);
            if (checked == '(') {
                stack.push(i);
            } else if (checked == ')') {
                int startIndex = stack.pop();
                expression = input.substring(startIndex, i + 1);
                System.out.println(expression);
            }
        }
    }
}
