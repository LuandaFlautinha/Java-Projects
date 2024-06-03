package list;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import entities.ClassList;

public class Exercicio01Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered ?");
        int qtdContas = sc.nextInt();
        List<ClassList> list = new ArrayList<>();
        for(int i = 0 ;i<qtdContas;i++){
            System.out.println("Emplyoee #"+(i+1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();
            list.add(new ClassList(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        ClassList dadoId = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        System.out.println(id);
        if(dadoId == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            dadoId.addSalary(percentage);
        }
        System.out.println("List of employees: ");
        for(ClassList obj : list){
            System.out.println(obj);
        }       

        sc.close();
    }
}
