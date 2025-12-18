package CoreProgramming.JavaArrays.level2;

import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);

        sc.close();
    }
}