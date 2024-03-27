

//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.


public class Lt01_Func41 {

    
    public static void combinacaoDados(int parametro) { // isso nao é funcao
        // Loop para o primeiro dado de 1 a 6
        for (int i = 1; i <= 6; i++){

            // Loop para o segundo dado de 1 a 6
            for (int j = 1; j <= 6; j++) {
                
                // Verifica se a soma é igual ao alvo
                if (i + j == parametro) {
                    System.out.println(  i + " + " + j +" = "+ parametro);
                }
            }
        }
    }

    public static void main(String[] args) {
        combinacaoDados(7);
    }
}
