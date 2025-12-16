package Level1_practice;

import java.util.*;

public class KmToMilesInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");

        double km = sc.nextInt();
        double miles = (km/1.6);

        System.out.println("The total miles is " + miles + " for the given " + km + " Km");
        sc.close();
    }
}
