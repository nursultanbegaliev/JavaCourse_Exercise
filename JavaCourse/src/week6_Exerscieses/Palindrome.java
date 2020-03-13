package week6_Exerscieses;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int num = number;
        int integer = 0;

        while (num > 0) {
            integer = integer*10 + num % 10;
            num /= 10;

        }
        //System.out.println(integer);
        if(number == integer) {
            System.out.print("This number is palindrome");
        }
        else if(number != integer) {
            System.out.print("This number is not palindrome");
        }
    }

}
