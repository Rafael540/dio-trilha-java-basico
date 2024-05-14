import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        float valorSalario = leitor.nextFloat();
        float valorBeneficio = leitor.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;       
        }else if (valorSalario <= 2.500){
            valorImposto = 0.10F * valorSalario;
        }else{
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2F", saida));
    }
}
