package Practice_Problems;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal : ");
        double principal = sc.nextDouble();

        System.out .print("Enter rate : ");
        double rate = sc.nextDouble();

        System.out.print("Enter time : ");
        double time = sc.nextDouble();

        double SimpleInterest = (principal * rate * time)/100;

        System.out.println("The simple interest is : " + SimpleInterest);
        sc.close();
    }
}
