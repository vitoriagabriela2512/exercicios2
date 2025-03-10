
package classeanimais;


public class ClasseAnimais {


    public static void main(String[] args) {
       Animais[] animais = { new Cachorros(), new Gatos() };

        // sor dei uma pesquisada e olhei uns videos pq do jeito q tu ensinou n estava indo então usei arrays e for 
        //pra ver se ia dar então n mexi mais
        for (Animais animal : animais) {
            animal.emitirSom();
        }

    }
    
}
