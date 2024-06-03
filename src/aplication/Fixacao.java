package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;
public class Fixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        Rent rent = new Rent();

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented ?");        
        int n = sc.nextInt();

        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.println("Rent #"+ i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
            
            System.out.println();
        }
        System.out.println("Busy room: ");
        for(int i = 0 ;i<10;i++){
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
