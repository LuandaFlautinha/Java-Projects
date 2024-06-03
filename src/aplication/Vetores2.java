package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar ?");        
        int n = sc.nextInt();
        double soma = 0;
        double media;
        double[] vect = new double[n];
        for(int i = 0; i<n ; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            soma += vect[i];
        }
        media = soma/n;
        System.out.print("Valores: ");
        for(int i=0;i<n;i++){
            System.out.print(vect[i]+ " ");
        }
        System.out.println();
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
        sc.close();
    }
}
