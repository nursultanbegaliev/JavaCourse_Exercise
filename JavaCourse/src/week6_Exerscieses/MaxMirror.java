import java.util.ArrayList;
import java.util.Scanner;

public class MaxMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] var = input.nextLine().trim().split(" ");
        ArrayList<Integer> intArray = new ArrayList<>();

        for(int i = 0; i < var.length; i++) {
            intArray.add(Integer.parseInt(var[i]));
        }

        int counter = 0;

        for(int j = 0; j < intArray.size(); j++) {
            for(int c = intArray.size()-1; c > j; c--) {
                if (intArray.get(j) == intArray.get(c)) {

                    if (intArray.get(j+1) == intArray.get(c-1)) {
                        counter++;
                        intArray.remove(c);
                        break;
                    }
                    else{
                        counter++;
                        intArray.remove(c);
                        intArray.remove(j);
                        break;
                    }
                }
//
//
//                }
            }
        }
        System.out.println("This is " + counter);



    }
}





/* Pseudocode
Task:
I have to find amount of same number order from input of user

1. Take elements as string and put them into array.

2. Covert elements of array into integer and put them to another array.

3. Compare elements of array:
    1 Take first element and compare it with others.
        1 Compare with indexes; Take first index and compare it with others till first. And so with others till the end.
    2 If there is similar numbers in comparison increase (counter) defined variable by 1.



 */