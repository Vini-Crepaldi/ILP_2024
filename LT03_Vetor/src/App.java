import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        float soma, vit, der, emp, timeA,timeB,timeC,timeD,golS,golM, maior ;

        for(int cta = 1; cta <= 4; cta++){

            do {
                vit = Float.parseFloat(JOptionPane.showInputDialog("Vitorias: "));
                der = Float.parseFloat(JOptionPane.showInputDialog("Derrotas: "));
                emp = Float.parseFloat(JOptionPane.showInputDialog("Empates: "));

                soma = (vit + der + emp);
                if(soma != 12){
                    JOptionPane.showMessageDialog(null,"partidas fora do criterio");;
                }
            } while (soma != 12);


            do {
                golM = Float.parseFloat(JOptionPane.showInputDialog("gols marcados: "));
                if(golM > 13 || golM < 20){
                    JOptionPane.showMessageDialog(null,"gol M fora do criterio");;
                }
            } while (golM > 13 || golM < 20);


            do {
                golS = Float.parseFloat(JOptionPane.showInputDialog("gols sofridos: "));

                if(golS > 13 || golS < 9){
                    JOptionPane.showMessageDialog(null,"gols s fora do criterio");;
                }
            } while (golS > 13 || golS < 9);


            float ponto = ((vit *3)+ emp);
            float prob = ((ponto/36) * 100);
            float saldoG = (golM - golS);
            
            switch (cta) {
                case 1:
                    timeA = prob;
                    float sA = saldoG;
                    if
                    break;
            
                default:
                    break;
            }




        }
    }







}
