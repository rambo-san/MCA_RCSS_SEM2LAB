import java.io.*;

class MinOfThreeNUM {

    public static int findMinimum(int a, int b, int c) {
        return a < b ?(a<c?a:c) :(b<c?b:c);
    }
    public static void main(String args[]) {

       DataInputStream din= new DataInputStream(System.in);

        int a,b,c;
	try{
        System.err.println("Enter three numbers : ");

        a = Integer.parseInt(din.readLine());
        b = Integer.parseInt(din.readLine());
        c = Integer.parseInt(din.readLine());;

        int min = findMinimum(a, b , c);

        System.out.println("Smallest is : "+min);
	}
	catch (Exception e)
	{	
		 System.out.println("Errors : "+e);
	}

    }
}