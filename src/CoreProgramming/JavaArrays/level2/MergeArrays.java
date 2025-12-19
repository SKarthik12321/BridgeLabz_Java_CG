package CoreProgramming.JavaArrays.level2;

import java.util.Scanner;

class MergeArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[size1 + size2];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[size1 + i] = arr2[i];
        }

        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }

        sc.close();
    }
}