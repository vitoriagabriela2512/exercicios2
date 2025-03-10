
package classeveiculos;


public class ClasseVeiculos {

    public static void main(String[] args) {
       Veiculos v1 = new Veiculos(180);
        v1.descrever(); 
        v1.descrever(" Veículo em alta velocidade."); 
        System.out.println();

        // Testando a classe Moto
        Motos m1 = new Motos(220, 600);
        m1.descrever(); 
        m1.descrever(" Ideal para quem gosta de velocidade!"); 
    }
    }
    

