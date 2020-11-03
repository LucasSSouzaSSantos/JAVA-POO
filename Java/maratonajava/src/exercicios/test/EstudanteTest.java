package exercicios.test;

import exercicios.classes.EstudanteExercicio;

public class EstudanteTest {

    public static void main(String[] args) {
        
        EstudanteExercicio e1 = new EstudanteExercicio();
        EstudanteExercicio e2 = new EstudanteExercicio();
        
        e1.nome = "Lucas de Souza Santos";
        e1.idade = 15;
        double notas[] = {8, 8, 8};
        e1.notas = notas;
        
        e2.nome = "Flagrosa  Leopoldina das Graças Cunha";
        e2.idade  = 15;        
        e2.notas = new double[]{9, 2, 10};
        
        e1.situacao();
        System.out.println(" ");
        e2.situacao();
    }
    
}
