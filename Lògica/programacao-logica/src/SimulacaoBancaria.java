import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (opcao != 0) { 
            int opcao = scanner.nextInt(); 
            double depositar = 0;
            double sacar = 0;
            
            switch(opcao){
              case 1:
                println("Deseja depositar qual valor: ");
                depositar = scanner.nextDouble();
                saldo = saldo + depositar;
                break;
              case 2:
                println("Quanto deseja sacar:");
                sacar = scanner.nextDouble();
                saldo = saldo - sacar;
                break;
              case 3:
                extracted(saldo);
                break;
              case 4:
                break;
            }

        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            
        
        
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }

    private static void extracted(double saldo) {
        println(saldo);
    }

    private static void println(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'println'");
    }
    }
}
