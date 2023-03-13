package HW4;

import java.util.Scanner;

public class PairOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = input.nextInt();
        System.out.println("Factor pairs of " + num + ":");
        for (int i = 1; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                System.out.println("(" + i + "," + (num / i) + ") ");
            }
        }
    }
}
