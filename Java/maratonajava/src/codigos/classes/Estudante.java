package maratonajavanovo.classes;

public class Estudante {
    public String nome = null;
    public String matricula = null;
    public int idade = 0;
    
    
    public void Status(){
        System.out.println("NOME: " + this.nome);
        System.out.println("MATRICULA: " + this.matricula);
        System.out.println("IDADE: " + this.idade);
    }
}
