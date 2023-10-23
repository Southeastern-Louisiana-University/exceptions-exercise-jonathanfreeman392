package chapter12;

import java.util.Scanner;
public class Quotient {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num2 != 0) {
            System.out.println("\n" + num1 + " \\ " + num2 + " = " + (num1 / num2));
        }
        else
            System.out.println("\ndivisor can not be 0\n");
        int result = quotient(num1, num2);
        System.out.println(num1 + "/" + num2 + " is " + result);
        System.out.println("\nNext Line\n");
    }
    public static int quotient(int number1, int number2){
        if(number2 == 0){
            System.out.println("\nDivisor can't be zero \n");
            System.exit(1);
        }
        return number1/number2;
    }
}
