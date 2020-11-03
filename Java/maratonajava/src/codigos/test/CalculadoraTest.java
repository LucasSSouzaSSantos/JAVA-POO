package codigos.test;

import codigos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
            
        Calculadora c1 = new Calculadora();
        
        
        // método da aula 27
        System.out.println("=== Aula 27 ===");
        c1.somaDoisNumero();
        c1.subtraiDoisNumero();
        c1.multiplicaDoisNumero();
        c1.dividiDoisNumero();
        
        System.out.println(" ");
        // método da aula 28
        System.out.println("=== Aula 28 ===");
        c1.multiplicaDoisNumero(4, 6);
        
        System.out.println(" ");
        // método da aula 29
        System.out.println("=== Aula 29 ===");
        double res = c1.dividaDoisNumeros(8, 2);
        System.out.println("O resultado da divisao é " + res);
        
        // método da aula 30
        System.out.println("=== Aula 30 ===");
        double res0 = c1.dividaDoisNumeros(14, 0);
        System.out.println(res0);
        
         // método da aula 31
         System.out.println("=== Aula 31 ===");
    }
    
}
