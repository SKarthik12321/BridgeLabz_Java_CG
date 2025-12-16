package Level1_practice;

import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (in inch): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height (in inch): ");
        double height = sc.nextDouble();

        double areaInSqInch = 0.5 * base * height;
        double areaInSqCm = areaInSqInch * 2.54 * 2.54;

        System.out.println("Your area in cm is " + areaInSqCm  + " and inches is " + areaInSqInch);
        sc.close();
    }
}
