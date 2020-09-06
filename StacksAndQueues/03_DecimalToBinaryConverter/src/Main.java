/*Create a simple program that can convert a decimal number to its binary representation.
Implement an elegant solution using a Stack.
Print the binary representation back at the terminal.
Examples
Input	Output
10	1010
1024	10000000000
Hints
If the given number is 0, just print 0
Else, while the number is greater than zero, divide it by 2 and push the reminder into the stack */

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque();

        int input = Integer.parseInt(scanner.nextLine());
        if (input == 0) {
            System.out.println(input);
        } else {
            while (input != 0) {
                stack.push(input % 2);
                input /= 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }

    }
}
