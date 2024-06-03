package aplication;
import java.util.Scanner;

import entities.Aluno;

public class Escola {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Aluno student = new Aluno();

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60){
            System.out.println("Failed");
            System.out.println("Pontos que faltaram: "+ student.notaAluno());
        }else{
            System.out.println("Pass");
        }

        sc.close();
    }
}
