package Practice_Problems;

import java.util.*;

public class PowerCalculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        double base = sc.nextDouble();
        System.out.print("Enter Exponent : ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("The power of " + base + "^" + exponent + " is " + result);
        sc.close();
    }
}
