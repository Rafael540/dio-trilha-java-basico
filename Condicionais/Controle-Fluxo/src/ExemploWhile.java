import java.util.concurrent.ThreadLocalRandom;;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

            while(mesada > 0){
                Double valorDoce = ValorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.println("Doce do valor : " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }

            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozionho gastou toda a sua mesada em doces");
    }

    public static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
