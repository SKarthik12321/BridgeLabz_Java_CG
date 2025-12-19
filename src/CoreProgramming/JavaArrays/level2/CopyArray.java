package CoreProgramming.JavaArrays.level2;

import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] source = new int[size];
        int[] destination = new int[size];

        for (int i = 0; i < source.length; i++) {
            source[i] = sc.nextInt();
        }

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i]);
        }

        sc.close();
    }
}