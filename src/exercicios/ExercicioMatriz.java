package exercicios;
import java.util.Scanner;
public class ExercicioMatriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        
        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um numero inteiro X: ");
        int x = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == x){
                    System.out.print("Posição do numero desejado: ");
                    System.out.println(i + ", "+ j);
                    if(j+1 < n){
                        System.out.println("O valor a direita: "+ mat[i][j+1]);
                    }
                    if(j - 1 >= 0){
                        System.out.println("O valor a esquerda: "+ mat[i][j-1]);
                    }    
                    if(i + 1 < m){
                        System.out.println("O valor abaixo: "+ mat[i+1][j]);
                    }
                    if(i - 1 >= 0){
                        System.out.println("O valor acima: "+mat[i-1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
