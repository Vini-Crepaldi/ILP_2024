
//45. Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225


public class Lt01_EstRep45 {
    public static void main(String[] args) {
        double acumulador = 1;
        double dividendo,impar = 3;
        double divisor = 4;

        for(dividendo = 2; dividendo <= 15; dividendo++ ){
            if((dividendo%2) == 0){

                System.out.println(acumulador+" - "+dividendo+"/"+divisor);
                acumulador = acumulador - (dividendo/divisor);

            }else{
                System.out.println(acumulador+" + "+dividendo+"/"+divisor);
                acumulador = acumulador + (dividendo/divisor);
            }
            impar = impar + 2;
            divisor =  divisor + impar;
        }
        System.out.println(acumulador);
    }
}
