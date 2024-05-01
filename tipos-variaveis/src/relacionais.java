public class relacionais {
    
    public static void main(String[] args) {
       String nome = "RAFAEL";
       String nomeDois = new String("RAFAEL");

       System.out.println(nome.equals(nomeDois));
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a Numerodois: " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a Numerodois: " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a Numerodois: " + simNao);


    }
}
