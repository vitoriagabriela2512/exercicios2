
package classecalculadora;

public class ClasseCalculadora {

    
    public static void main(String[] args) {
       Calculadora c1 = new Calculadora();
       
        System.out.println("Multiplicação de dois inteiros:"+ c1.multiplicar(2, 8));
        System.out.println("Multiplicação de três inteiros: "+ c1.multiplicar(8, 2, 4));
        System.out.println("Multiplicação de dois doubles: " + c1.multiplicar(2.7, 3.8));
    }
    
}
