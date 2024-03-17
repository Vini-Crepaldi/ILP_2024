


import javax.swing.*;
public class Lt01_EstRep32_A {
    public static void main(String[] args) {
        int num, fat=1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Qual numero"));

        for(int cta=1;cta<=num;cta++){
            fat = (fat * cta);
            System.out.println(fat);
        }
    }
}
