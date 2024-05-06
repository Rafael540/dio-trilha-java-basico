public class Operadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":{
                System.out.println("5GB Youtuve");
            }
            case "M" :{
                System.out.println("Whats e Intagra grátis");
                
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            default: 
                System.out.println("Indefinido");
            }
        }
}
