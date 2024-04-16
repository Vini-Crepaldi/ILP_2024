import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        MetodosMatriz m = new MetodosMatriz();
        Scanner input = new Scanner(System.in);
        int mat[][] = new int[10][10];

        int opc = 0;
        while (opc != 9) {

            System.out.println("1 - Carrega Matriz\n2 - Clasifica Matriz");
            opc = input.nextInt();
            
            switch (opc) {
                case 1:
                    mat = m.CarregaMatriz(mat);
                break;
                case 2:
                    mat = m.Classifica(mat);
                    m.MostraMatriz(mat);
                break;
                case 9:System.out.println("FIM");
            }
        }
        
        
        input.close();
    }
}
