import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        String numeroConta;
      
        numeroConta = scanner.next();
        

        try {
          verificarNumeroConta(numeroConta);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: ");    
            e.printStackTrace();
        } finally {
            scanner.close();}
        }
   
// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException { 
        if(numeroConta.length() == 8){
            System.out.println("Numero de conta valido."); 
        }else{ 
            
            throw new IllegalArgumentException();
        }
// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
   
// TODO: Implemente uma exceção do tipo , caso o número de conta não tenha 8 dígitos:
            
        }
    

}
