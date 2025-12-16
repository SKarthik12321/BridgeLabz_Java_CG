package Level1_practice;

import java.util.*;

public class DistanceConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double DistanceInFeet = sc.nextDouble();
        double DistanceInYards = (DistanceInFeet/3);
        double DistanceInMile = (DistanceInYards/1760);

    }
}
