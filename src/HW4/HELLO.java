package HW4;

import java.util.Scanner;

public class HELLO {
    public static void main(String[] args) {

        int i;
        for (i=1;i<5;i++);
            switch (i) {
                case 1:
                    System.out.println("Hello");
                    break;}


        Scanner input = new Scanner(System.in);

        System.out.println("Choose language : \n1.English\n2.Italian\n3.Romanian\n4.French" );

        int choice = input.nextInt();


        switch ( choice){
            case 1 -> System.out.println("Hello!");
            case 2 -> System.out.println("Buon giorno!");
            case 3 -> System.out.println("Buna!");
            case 4 -> System.out.println("Bonjour!");
            default -> System.out.println("Invalid choice");


        }

    }
}
