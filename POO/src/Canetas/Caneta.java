package Canetas;


public class Caneta {
    String modelo;    
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Cor: "+ this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Tam Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga+"%");
        System.out.println("Cor: "+ this.cor);
    }


    void rabiscar(){
        if(tampada == false){
            System.out.println("Rabisco");
        }else{
            System.out.println("\nCaneta tampada Impossivel rabiscar");
        }
    }

    void tampa(){
        if(tampada == true){
            System.out.println("Destampou a Caneta");
            tampada = false;
        }else{
            System.out.println("Tampou a Caneta");
            tampada = true;
        }

    }
}
