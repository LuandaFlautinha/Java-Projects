package aplication;
import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar ?");        
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for(int i=0; i<n; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}