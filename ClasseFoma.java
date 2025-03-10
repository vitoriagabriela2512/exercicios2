package classefoma;

public class ClasseFoma {

    public static void main(String[] args) {

        //Forma f1 = new Forma(); Classe abstrata não é possivel instancear obj
        Circulo c1 = new Circulo(12.14);
        c1.cor = "Verde";
        c1.CalcularArea();
         System.out.println("Calculo da Área: " + c1.CalcularArea());
        c1.exibir();
        
        Retangulo r1 = new Retangulo();
         r1.DefinirDimensoes(12, 13);
        r1.cor = "Azul";
        r1.CalcularArea();
        
         System.out.println("Calculo da Área: " + r1.CalcularArea() );
        
         r1.exibir();
    }
    

}
