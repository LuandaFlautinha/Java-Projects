package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;

public class Banco {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char op;
        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine();//essa parte aqui serve para consumir a quebra de linha 
        //que o nextInt() cria, após a digitação do numero pelo usuário
        System.out.println();

        System.out.println("Enter account Holder: ");
        String name = sc.nextLine();

        Cliente cliente = new Cliente(id, name);
        System.out.println("Is there a initial deposity (y/n)");
        op = sc.next().charAt(0);

        while(op != 'y' && op != 'n'){
            System.out.println();
            System.out.println("Foi digitado a opção errada, por favor, digite novamente");
            op = sc.next().charAt(0);
        }

        if(op == 'y'){
            System.out.println("Enter a initial deposity: ");
            double quantityDeposity = sc.nextDouble();
            cliente.setQuantityDeposity(quantityDeposity);
            System.out.println("Account data: "+cliente);
        }else{
            System.out.println("Account data: "+cliente);
        }
        System.out.print("Enter a deposity value: ");
        double deposity = sc.nextDouble();
        cliente.addQuantity(deposity);
        System.out.println("Updated account data: "+cliente);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double deposityDraw = sc.nextDouble();
        cliente.removeQuantity(deposityDraw);
        System.out.println("Updated account data: "+cliente);

        sc.close();
    }
}
