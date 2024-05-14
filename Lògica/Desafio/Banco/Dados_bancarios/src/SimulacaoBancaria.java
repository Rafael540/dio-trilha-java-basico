import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        double deposito = 0;
        double sacar = 0;
        int opcao = 0;
    
        while(opcao != 4) {
            opcao = scanner.nextInt(); 
            switch (opcao){
                case 1:
                    deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    sacar = scanner.nextDouble();
                    if(sacar < saldo){
                    saldo = saldo - sacar;
                    System.out.println("Saldo atual: " + saldo);
                    
                }else{
                    System.out.println("Saldo insuficiente.");
                   
                } break;
                    
                case 3:
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    opcao = 4;
                    break;
                default:
                    if(opcao >= 5){
                    System.out.println("Opção inválida. Tente novamente.");
                    }
                    break;
            
          
             }
              
         }
    }
    
}