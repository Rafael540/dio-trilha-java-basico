public class SmartTv {
    boolean ligada= false;
    int canal= 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;//novoCanal está disponível só nesse bloco de código
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume +1
        
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    
}
