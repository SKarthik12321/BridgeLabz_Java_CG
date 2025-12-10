//Program 5 Prime Factors

import java.util.*;

public class PrimeFactorial {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i<=n*n; i++){
            while(n % i == 0){
                System.out.println(i + " ");
                n = n/i;
            }
        }
        sc.close();
    }
}
