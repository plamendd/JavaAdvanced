import java.util.ArrayDeque;
import java.util.Scanner;
/*1.Browser History
Write a program which takes 2 types of browser instructions:
Normal navigation: a URL is set, given by a string
The string "back" that sets the current URL to the last set URL
After each instruction the program should print the current URL. If the back instruction can’t be executed, print
"no previous URLs". The input ends with "Home" command, then simply you have to stop the program.

Examples
Input	Output
https//softuni.bg/
back
https//softuni.bg/trainings/courses
back
https//softuni.bg/trainings/2056
back
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details
Home	https//softuni.bg/
no previous URLs
https//softuni.bg/trainings/courses
https//softuni.bg/
https//softuni.bg/trainings/2056
https//softuni.bg/
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details
Hints
Use ArrayDeque<>
Use String to keep current page
Use push(), when moving to next page
Use pop(), when going back */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();


        String input = scanner.nextLine();

        while (!"Home".equals(input)) {
            if ("back".equals(input)) {
                if (stack.size() > 1) {
                    stack.pop();
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                stack.push(input);
                System.out.println(stack.peek());
            }
            input = scanner.nextLine();
        }


    }
}

