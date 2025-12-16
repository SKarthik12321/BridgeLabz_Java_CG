package Level1_practice;

import java.util.*;

public class MaxNoHandshakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numberOfStudents = sc.nextInt();
        int maxNoHandshakes = (numberOfStudents * (numberOfStudents-1)) / 2;
        System.out.println("The maximum number of possible handshakes " + maxNoHandshakes);
        sc.close();
    }
}
