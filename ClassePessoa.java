
package classepessoa;


public class ClassePessoa {

   
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa("Carlos", 25); 
      Aluno a1 = new Aluno("Fernanda", 14, "105532");
      p1.exibir();
      a1.exibirInformacoes();
    }
    
}
