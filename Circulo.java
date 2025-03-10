package classefoma;

public class Circulo extends Forma {

    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {

    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }
    public void setraio(int raio) {
        this.raio = raio;
    }

 

    public void definirDimensoes(int raio) {
        this.raio = raio;
    }

    public void definirDimensoes(double raio) {
        this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * raio * raio;
    }
}
