//Problem 2 Leap Year

import java.util.*;
public class LeapYear{
    public static void main(String[] args){
        System.out.print("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year%4 == 0 && year%100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}