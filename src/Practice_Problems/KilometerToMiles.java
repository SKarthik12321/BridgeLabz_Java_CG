package Practice_Problems;

import java.util.*;

public class KilometerToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers : ");
        double km = sc.nextDouble();
        double miles = km * 0.62171;
        System.out.println("The distance in miles is " + miles);
        sc.close();
    }
}
