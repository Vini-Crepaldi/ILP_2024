//Receba um número inteiro. Calcule e mostre o seu fatorial.



import javax.swing.*;
public class Lt01_EstRep32 {
    public static void main(String[] args){
         int num;
         
         num = Integer.parseInt(JOptionPane.showInputDialog("Qual numero? "));
        
        /*  for(int cta = num; cta > 1; cta --){
            num = (num * (cta-1));
            System.out.println(num);

         }*/

        for(int cta = (num-1);cta > 1; cta--){
            num = (num * cta);
            System.out.println(num);
        }

    }
}
