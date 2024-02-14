//Write a Java program to multiply two matrices
import java.util.*;
public class MatrixMulti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrix1[][],matrix2[][];
        int r,i,j,k;
        try{
            System.out.println("Enter the size of the Matrics : ");
            r=s.nextInt();
            matrix1=matrix2= new int[r][r];
            System.out.println("Enter the First Matrix : ");
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    matrix1[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter the Second Matrix : ");
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    matrix2[i][j]=s.nextInt();
                }
            }
            System.out.println("Matrix : ");
            for(i = 0;i<r;i++){
                for(j=0;j<r;j++)
                {
                    System.out.print(matrix1[i][j]+"  ");
                }
                System.out.println("\n");
            }
            multiply(matrix1, matrix2, r);
        }
        catch(Exception e){
            
        }
        finally{
            s.close();
        }
    }
    public static void multiply(int[][] matrix1, int matrix2[][],int r){
        int i,j,k, product[][];
        product= new int[r][r];
        for(i = 0;i<r;i++){
            for(j=0;j<r;j++)
            {
                product[i][j]=0;
                for(k=0;k<r;k++){
                    product[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("The product : ");
        for(i = 0;i<r;i++){
            for(j=0;j<r;j++)
            {
              System.out.print(product[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
}
