import javax.swing.JOptionPane;

public class Metodos {

    public  Estatistica[] CarregaEst(Estatistica[] cidades){

        for(int i = 0; i < cidades.length; i ++){

            cidades[i].CodCidade = Integer.parseInt(JOptionPane.showInputDialog("Codigo da ciade N°"+ i + " :"));
            cidades[i].NomeCidade = JOptionPane.showInputDialog("Nome da Cidade N°"+ i + " :");
            cidades[i].ContAci = Integer.parseInt(JOptionPane.showInputDialog("Acidentes cidade N°"+ i + " :"));
        }


    return cidades;

    }



    public void  Consulta(Estatistica[] cidades){
        String totalCity = "";
        for(int i = 0; i < cidades.length; i ++){

           // String nome = cidades[i].NomeCidade

            totalCity += (cidades[i].NomeCidade +" "+ cidades[i].ContAci + "\n");

        }
        JOptionPane.showMessageDialog(null,totalCity);
    }
}
