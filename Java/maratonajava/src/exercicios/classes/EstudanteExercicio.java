package exercicios.classes;

public class EstudanteExercicio {
    
    // atributo da classe
    public String nome;
    public int idade;
    public double[] notas;
    
    // método da classe
    public void situacao(){
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Situação: " + this.calcularMedia());
    }
    
    public String calcularMedia(){
        double media = 0;
        for(double nota: notas){
            media += nota;
        }
        media = media / notas.length;
        if(media >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
        
    }
    
    
}
/***
 * Crie uma classe estudante com os 
 * seguintes atributos:
 *  - nome
 *  - idade
 *  - notas // três notas
 * 
 * crie um método para imprimir os dados e tirar a média desse
 * aluno. Caso a média seja maior que 6 imprimir aprovado, senão reprovado.
 * 
 */
