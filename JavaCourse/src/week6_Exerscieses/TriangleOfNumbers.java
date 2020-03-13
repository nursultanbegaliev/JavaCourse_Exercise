package week6_Exerscieses;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = number; j > i; j--) {
                System.out.print("*");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();

        }
    }
}
