

//Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

public class Lt01_Func45 {

    static double caclulaSerie(int parametro){
        double acumulador = 1;
        double dividendo,impar = 3;
        double divisor = 4;

        for(dividendo = 2; dividendo <= parametro; dividendo++ ){
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
        return acumulador;
    }
    public static void main(String[] args) {
        
        double res = caclulaSerie(15);
        System.out.println(res);

    }
}
