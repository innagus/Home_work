package HW4;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число для проверки" +
                ": ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " -  является четное число.");
        } else {
            System.out.println(number + " -  является нечетным числом.");
        }
    }
}

