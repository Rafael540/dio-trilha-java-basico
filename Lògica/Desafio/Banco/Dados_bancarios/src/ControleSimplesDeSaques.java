import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque = scanner.nextDouble();
        int i;

        for(i= 0; saque <= limiteDiario && saque != 0; i++){
            limiteDiario= limiteDiario - saque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            saque = scanner.nextDouble();
        } 

        if(limiteDiario < saque){
            System.out.println("Limite diario de saque atingido.");
        }
        
            System.out.println("Transacoes encerradas");
            scanner.close(); 
        
    }
}
