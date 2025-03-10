
package classepessoa;

public class Aluno extends Pessoa{
    public String matricula;
    
    public Aluno(String nome, int idade,String matricula){
    this.matricula = matricula;
     this.idade = idade;
    this.nome = nome;
   
    }
    public Aluno(){
    
    }

    
    public String getMatri (){
    return matricula;
    }
     public void setMatri ( String matricula){
    this.matricula = matricula;
   
     }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome); 
        System.out.println("Idade: " + getIdade());  
        System.out.println("Matrícula: " + matricula);
    }

    void getIdade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
