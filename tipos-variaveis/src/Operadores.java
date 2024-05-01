public class Operadores {
    
    public static void main (String[] args){
        //classe Operadores.java
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.print(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        
        System.out.println(concatenacao);
    
    }
}
