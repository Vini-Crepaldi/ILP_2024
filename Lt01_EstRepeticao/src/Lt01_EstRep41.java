

//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.


public class Lt01_EstRep41 {
    public static void main(String[] args) {

            
        for(int d1 = 1; d1 <= 6; d1++){
            for(int d2 = 1; d2<=6; d2++){
                if(d1+ d2 == 7){
                    System.out.println(d1+" + "+d2+" = "+(d1+d2));
                }
            }
        }
        
    }
}
