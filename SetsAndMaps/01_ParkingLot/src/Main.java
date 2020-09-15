/*
Write a program that:
 Records car number for every car that enter in the parking lot
 Removes car number when the car go out
Input
The input will be string in format [direction, carNumber]
The input ends with string &quot;END&quot;
Output
Print the output with all car numbers which are in parking lot
Examples

Input Output

IN, CA2844AA
IN, CA1234TA
OUT, CA2844AA
IN, CA9999TT
IN, CA2866HI
OUT, CA1234TA
IN, CA2844AA
OUT, CA2866HI
IN, CA9876HH
IN, CA2822UU
END

CA9999TT
CA2844AA
CA9876HH
CA2822UU

IN, CA2844AA
IN, CA1234TA
OUT, CA2844AA
OUT, CA1234TA
END

Parking Lot is Empty

Hints
 Car numbers are unique
 Use the methods isEmpty()
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] toAdd = input.split(", ");
            if (toAdd[0].equals("IN")) {
                cars.add(toAdd[1]);
            }{
                if (toAdd[0].equals("OUT") && cars.contains(toAdd[1])){
                    cars.remove(toAdd[1]);
                }
            }
            input = scanner.nextLine();

        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            cars.forEach(x -> System.out.println(x));
        }

    }
}
