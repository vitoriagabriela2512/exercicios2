package classeveiculos;

public class Motos extends Veiculos {

    private int cilindradas;

    public Motos(int velocidadeMax, int cilindradas) {
        super(velocidadeMax);
        this.cilindradas = cilindradas;
    }

    public int getCilin() {
        return cilindradas;
    }

    public void setCilin(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public void descrever() {
        System.out.println("Moto com " + cilindradas + " cilindradas e velocidade máxima de " + velocidadeMax + " km/h");
    }

}
