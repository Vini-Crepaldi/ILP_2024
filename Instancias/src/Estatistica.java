public class Estatistica {
    
    int CodCidade;
    String NomeCidade;
    int ContAci;

    Estatistica(){
        this(0,"",0);
    }

    Estatistica(int cod, String nome, int cont){
        CodCidade = cod;
        NomeCidade = nome;
        ContAci = cont;

    }
}
