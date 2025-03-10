package classefoma;

public abstract class Forma {

    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public Forma() {
    }
//      public String getCor() {
//        return this.cor;
//    }
//    public void setCor(String cor) {
//        this.cor = cor;
//    }

    public abstract double CalcularArea();

    public void exibir() {
        System.out.println("Cor da forma: " + cor);
    }
}
