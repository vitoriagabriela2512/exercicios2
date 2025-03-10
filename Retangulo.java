package classefoma;

public class Retangulo extends Forma {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {
    }

  

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double CalcularArea() {
        return largura * altura;
    }

//    public void DefinirDimensoes(double altura, double largura) {
//        System.out.println("Altura: " + altura);
//        System.out.println("Largura: " + largura);
//
//    }
    public void DefinirDimensoes(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;

    }
    
    @Override
      public void exibir() {
        System.out.println("Cor da forma: " + cor);
        System.out.println("Altura: "+ altura);
        System.out.println("Largura: "+ largura);
    }

}
