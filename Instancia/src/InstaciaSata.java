/**
 * Metodos e vetores
 *
 *
 */
import javax.swing.JOptionPane;
public class InstaciaSata {
  public static void main (String arg [ ]) {
    ClasseMetodos m = new ClasseMetodos();

    int opc = 0;
      int vetor[ ] = new int[4];
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n2 - Classifica Vetor \n3 - Mostra Vetor \n9 - Fim"));

      switch (opc){
          case 1:
            vetor = m.CarregaVetor(vetor);
            break;
          case 2:
            vetor = m.ClassificaVetor(vetor);
            JOptionPane.showMessageDialog(null,"Vetor Classificado");
            break;
          case 3:
              m.MostraVetor(vetor);
              break;
          case 9:
              JOptionPane.showMessageDialog(null,"FIM");
              System.exit(0);
              break;
          default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
      }
   }
 }

} 
