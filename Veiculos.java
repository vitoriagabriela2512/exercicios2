
package classeveiculos;


public class Veiculos {
    protected int velocidadeMax;
    public Veiculos(int velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
    public Veiculos(){
    }
    
     public void descrever() {
        System.out.println("Velocidade máxima: " + velocidadeMax + " km/h");
    }
     public void descrever(String extra) {
        System.out.println("Velocidade máxima: " + velocidadeMax + " km/h"+ extra);
    }
}
