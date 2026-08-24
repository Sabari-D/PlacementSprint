import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        
        int[][] mtrx = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mtrx[i][j] = scanner.nextInt();
            }
        }
        
        
        int[][] transpose = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = mtrx[i][j];
            }
        }
        
        
        int [][] res = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                for(int k=0; k<col; k++){
                    res[i][j] += mtrx[i][k] * transpose[k][j];
                }
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
