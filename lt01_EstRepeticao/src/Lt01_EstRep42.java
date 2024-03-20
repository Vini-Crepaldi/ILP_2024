
//Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

public class Lt01_EstRep42 {
    public static void main(String[] args) {
        double acumulador =  1;  double divisor = 3;


        for(int dividendo = 2; dividendo <= 50; dividendo++){
            
            System.out.println(dividendo+"/"+divisor);

            acumulador = (acumulador + dividendo/divisor);
            divisor = divisor + 2;
        }
        System.out.println("Soma total da serie: "+ acumulador);
    }
}
