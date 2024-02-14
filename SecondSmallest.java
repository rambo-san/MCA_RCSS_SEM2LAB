//Write a Java program to find the second smallest element in an array

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int num;
        Scanner s=new Scanner(System.in);
            try{
            System.out.println("Enter the number of elements : ");
            num=s.nextInt();
            System.out.println("Enter the numbers into the array  : \n");
            for(int i=0;i<num;i++){
                arr[i]=s.nextInt();
            }
            int Smallest, SecondSmallest;
            Smallest=SecondSmallest=arr[0];
            for(int i=1;i<num;i++){
                if(arr[i]==Smallest || arr[i]==SecondSmallest)//same
                    continue;
                if(arr[i]<Smallest){
                    SecondSmallest=Smallest;
                    Smallest=arr[i];
                }
                else if(SecondSmallest>arr[i])
                    SecondSmallest=arr[i];
                else if(SecondSmallest==Smallest)
                    SecondSmallest=arr[i];
                } 
                System.out.println("Smallest : "+Smallest);
                System.out.println("Second Smallest : "+SecondSmallest);
                 
            }      
            catch(Exception e)
            {}
            finally{
                s.close();
            }

    }
}
