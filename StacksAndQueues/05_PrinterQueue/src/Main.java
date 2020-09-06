import java.util.ArrayDeque;
import java.util.Scanner;

/*
The printer queue is a simple way to control the order of files sent to a printer device. We know that a single printer can be shared between multiple devices. So to preserve the order of the files sent, we can use queue. Write down a program which takes filenames until "print" command is received. Then as output print the filenames in the order of printing. Some of the tasks may be canceled if you receive "cancel" you have to remove the first file to be printed. If there is no current file to be printed print "Printer is on standby".
Examples
Input	Output
Lab.docx
cancel
cancel
Presentation.pptx
NoteNothing.txt
SomeCode.java
cancel
print
	Canceled Lab.docx
Printer is on standby
Canceled Presentation.pptx
NoteNothing.txt
SomeCode.java
Hints
Use an ArrayDeque<>
Use offer(), when adding file
Use pollFirst(), when printing file
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque();
        String input = scanner.nextLine();

        while (!input.equals("print")) {
            if (!input.equals("cancel")) {
                queue.offer(input);
            } else {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }
            input = scanner.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
