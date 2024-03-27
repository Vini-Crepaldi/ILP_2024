/*
 * Calcule e mostre quantos anos serão necessários para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
 * e cresce 2 cm ao ano.
 */



public class Lt01_EstRep43 {
    public static void main(String[] args) {
        int maria, ana, ano = 0;

        ana = 110;
        maria =  150;

        while(ana<maria){
            ana += 3;
            maria += 2;
            ano++;
        }
        System.out.println(ano);
    }
}
