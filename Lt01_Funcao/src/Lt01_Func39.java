/*
 * Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 *  Qte: 1 2 4 8 ... N
 */

public class Lt01_Func39 {

    /*static int caluclaGrao(){
        
    }*/
    public static void main(String[] args) {
        double acumulador = 1;

        for(int cta = 1; cta <= 64; cta++){

            acumulador = (acumulador * 2);
        
           
        }
        System.out.println(acumulador);
    }
}
