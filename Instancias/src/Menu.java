import javax.swing.JOptionPane;

public class Menu {
    
// instacia obj  ee instancia metodos
    public static void main(String[] args) {
        Estatistica[] cidades = new Estatistica[2];
        Metodos metodos = new Metodos();

        int opc = 0;
        

        for(int cta = 0; cta < cidades.length; cta ++){
            cidades[cta] = new Estatistica();
            
        }





        while (opc != 9) {
            
            opc = Integer.parseInt(JOptionPane.showInputDialog("          Acidentes em 2020\n1 - Cadastro Estatistica\n2 - Consulta Quantidade Acidente\n3 - Consulta Estatistica\n4 - Acidente Acima da media"));

            switch (opc) {
                case 1:
                    cidades = metodos.CarregaEst(cidades);
                    break;
                case 2:
                    metodos.Consulta(cidades);
                
                default:
                    break;
            }

        }
    }
}
