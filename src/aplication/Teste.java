package aplication;
import entities.Funcionario;
import java.util.Scanner;

public class Teste {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        func.name = sc.nextLine();

        System.out.println();
        System.out.print("Digite o salrio bruto: ");
        func.salarioBruto = sc.nextDouble();

        System.out.println();
        System.out.print("Digite o imposto: ");
        func.imposto = sc.nextDouble();
        System.out.println();

        System.out.println("Funcionário data: " + func);
        System.out.println();

        System.out.print("Qual vai ser a taxa(porcentagem)? ");
        double porcentagem = sc.nextDouble();
        func.salarioAumento(porcentagem);
        System.out.println();

        System.out.println("Updated data: "+ func);

        sc.close();
    }
}
