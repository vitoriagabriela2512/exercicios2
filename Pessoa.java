
package classepessoa;


public class Pessoa {
    public String nome;
    int idade;
    
    public Pessoa(String nome, int idade){
    this.idade = idade;
    this.nome = nome;
    }
    public Pessoa(){
    
    }
    public int getIdade (){
    return idade;
    }
    public String getNome (){
    return nome;
    }
    public void setIdade (int idade){
    this.idade = idade;
    }
    public void setNome (String nome){
    this.nome = nome;
    }
    
      public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
