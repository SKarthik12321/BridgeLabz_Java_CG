package Level1_practice;

import java.util.*;

public class basicCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number 2 : ");
        double num2 = sc.nextDouble();

        double addition = (num1 + num2);
        double subtraction = (num1 - num2);
        double multiplication = (num1 * num2);
        double division = (num1 / num2);

        System.out.println("The addition, subtraction, multiplication, division value of 2 numbers " + num1 + " and " + num2 + " is " +
                addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        sc.close();
    }
}
