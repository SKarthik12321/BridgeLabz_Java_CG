package Level1_practice;

public class volumeOfEarth {
    public static void main(String[] args){

        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm / (Math.pow(1.6,3));

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
