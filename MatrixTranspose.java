//Write a Java program to find the transpose of a matrix. 
import java.util.*;
class MatrixTranspose{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrix[][], transpose[][];
        int r,i,j;
        try{
            System.out.println("Enter the size of the Matrics : ");
            r=s.nextInt();
            matrix= new int[r][r];
            transpose= new int[r][r];
            System.out.println("Enter the Matrix : ");
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    matrix[i][j]=s.nextInt();
                }
            }
            System.out.println("Entered Matrix : ");
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    System.out.print(matrix[i][j]+"\t");
                }
                System.out.println("");
            }
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    transpose[j][i]=matrix[i][j];
                }
            }
            System.out.println("Transpose of the Matrix : ");
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    System.out.print(transpose[i][j]+"\t");
                }
                System.out.println("");
            }
        }
        catch(Exception e){
            
        }
        finally{
            s.close();
        }
    }
}