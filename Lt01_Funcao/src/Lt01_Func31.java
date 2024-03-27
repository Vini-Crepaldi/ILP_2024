//Calcule e mostre o quadrado dos números entre 10 e 150.


public class Lt01_Func31 {
    static int quadrado(int num){
        num = (num*num);
        return num;
    }
    public static void main(String[] args) {
        
        for(int cta = 10 ; cta <= 150; cta++){
            System.out.println(quadrado(cta));
        }
    }
}
