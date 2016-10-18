package boletin4_1;

public class Coche {
    private int velocidade;
    
    public Coche(){
    velocidade = 0;
    }
public int getVelocidade(){ //Este método devolve a velocidade actual
    return velocidade;
    }
public void acelerar (int valor){ //Este método incrementa a velocidade na cantidade valor
    velocidade = velocidade + valor;
    }
public void frenar (int menos){ //Este método diminue a velocidade na cantidade menos.
    velocidade = velocidade - menos;
    }
                           
}