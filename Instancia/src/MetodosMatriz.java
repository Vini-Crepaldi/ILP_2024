import java.util.Random;

//import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class MetodosMatriz {
    
    public int[][] CarregaMatriz(int mat[][]){
        Random rad = new Random();
        int var = 0 ; 

        for(int x = 0; x < 10; x++){
            for(int y  = 0 ; y < 10; y++){
                do{
                    var = rad.nextInt(300);
                    if(var > 100){
                        mat[x][y] =  var;
                    }else{
                        break;
                    }
                }while(var > 100);
            }   
        
        }
        return mat;
    }

    public int[][] Classifica(int mat[][]){
        int[] vet = new int[10*10];
        int i = 0;
        int aux;

        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                vet[i] = mat[x][y];
                i++;
            }
        }


        for( i = 0; i < (vet.length - 1); i++){
            for(int j = (i + 1); j < vet.length; j++){
                if(vet[i] > vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        i = 0;
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                mat[x][y]  = vet[i];
                i++;
            }
        }

        return mat;
    
        
    }

    public void MostraMatriz(int mat[][]){
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
    }

}
