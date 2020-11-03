package codigos.classes;

public class Calculadora {
        
    // Métodos que não retornam nada da aula 27
    
    public void somaDoisNumero(){
        System.out.println("5 + 2 = " + (5 + 2));
    }
    
    public void subtraiDoisNumero(){
        System.out.println("5 - 2 = " + (5 - 2));
    }
    
    public void multiplicaDoisNumero(){
        System.out.println("5 * 2 = " + (5 * 2));
    }
    
    public void dividiDoisNumero(){
        System.out.println("5 / 2 = " + (5 / 2));
    }
    // Aula 27 termina Aqui
    
    /***
     * Aula 28: Passar Parâmetro para os métodos
     * @param num1  primeiro parâmetro que o método vai receber
     * @param num2  segundo parâmetro que o método vai receber
     *  esse método não retorna nenhum valor, mas imprime a divisão de num1 por num2.
     */
    public void multiplicaDoisNumero(int num1, int num2){
        int produto; // produto vai receber a multiplicação de num1 e num 2
        produto = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + produto);        
    }
    
    /***
     * Aula 29: Retornar valores atráves dos métodos
     * @param num1 primeiro parametro
     * @param num2 segundo parametro
     * @return  retorno da divisao de num1 por num2
     */
    public double dividaDoisNumeros(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        
        }else{
            System.out.println("Operaçao INVALIDA!!!");
            return 0;         
        }
    }
    
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois número");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
