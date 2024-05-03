import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
       //TO DO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       //Exibir as mensagens para nosso usuário;

       
       System.out.println("Por favor, digite o número da conta: " );
       int numero = scanner.nextInt();

       System.out.println("Por favor, digite o número da agência: ");
       String agencia = scanner.next();
       
       System.out.println("Por favor, digite o nome do cliente: ");
       String nome = scanner.next();

       System.out.println("Por favor, digite o nome do cliente: ");
       String sobrenome = scanner.next();

       System.out.println("Por favor, digite o saldo do cliente: ");
       double saldo = scanner.nextDouble();



       //Obter pela scanner os valores digitados no terminal

       //Exibir a mensagem final

       System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    
    
    }
}
