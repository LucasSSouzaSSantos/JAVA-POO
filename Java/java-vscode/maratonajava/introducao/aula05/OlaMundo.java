package maratonajava.introducao.aula05;

/* A primeira letra da classe em java sempre começa com a primeira letra em maiuscula quando a palavra é
    simples. Se a palavra for composta: as duas palavras devem ser únidas, formando apenas uma; e a primeira
    letra de cada palavra deve começar com letra mais maiuscula.
    ex:
        palavra         classe
        casa            Casa
        ola mundo       OlaMundo
    Outro detalhe não colocara acento ou caracterer especial.
    */
    /***
     * 
     * 
     */
public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        /***
         * Variável
         *  tipo primitivo
         *      int, double, float, boolean, char, byte, short, long
         * 
         *  tipo referencia
         */

         int primeiraVariavel = 10;

         System.out.println(primeiraVariavel);

         /**
          * As variáveis tem sem sempre a primeira letra do nome minuscula e o resto das letrad podem ser
          * maiuscula ou minuscula. Se o nome for composto, ela continua tendo a primeira letra minuscula, mas
          * a primeila letra da segunda palavra tem que ficar maiuscula.
          */

          System.out.println("O valor da variável é " + primeiraVariavel);

    }    
}
