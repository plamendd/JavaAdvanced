/*
There is a party in SoftUni. Many guests are invited, and they are two types: VIP and regular.
When guest comes, you have to check if he/she exist in any of two reservation lists.
All reservation numbers will be with 8 chars.



All VIP numbers start with digit.
There will be 2 command lines. First is &quot;PARTY&quot; - party is on and guests start coming.
Second is &quot;END&quot; - then party is over, and no more guest will come.
Output shows all guests, who didn&#39;t come to the party (VIP must be first).
Examples
Input Output Input Output
---------------------
7IK9Yo0h
9NoBUajQ
Ce8vwPmE
SVQXQCbc
tSzE5t0p
PARTY
9NoBUajQ
Ce8vwPmE
SVQXQCbc
END
----------
2
7IK9Yo0h
tSzE5t0p
----------------------------
m8rfQBvl
fc1oZCE0
UgffRkOn
7ugX7bm0
9CQBGUeJ
2FQZT3uC
dziNz78I
mdSGyQCJ
LjcVpmDL
fPXNHpm1
HTTbwRmM
B5yTkMQi
8N0FThqG
xys2FYzn
MDzcM9ZK
PARTY
2FQZT3uC
dziNz78I
mdSGyQCJ
LjcVpmDL
fPXNHpm1
HTTbwRmM
B5yTkMQi
8N0FThqG
m8rfQBvl
fc1oZCE0
UgffRkOn
7ugX7bm0
9CQBGUeJ
END
---------------
2
MDzcM9ZK
xys2FYzn
 */


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> isInList = new TreeSet<>();
        Set<String> incomes = new TreeSet<>();

        boolean startedParty = true;

        while (!input.equals("END")) {
            if (input.equals("PARTY")) {
                startedParty = false;
            }

            if (startedParty) {
                isInList.add(input);
            } else {
                incomes.add(input);
            }


            input = scanner.nextLine();
        }

        isInList.removeAll(incomes);
        System.out.println(isInList.size());
        isInList.forEach(c -> System.out.println(c));
    }

}
