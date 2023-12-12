import java.io.*;

class MaxOfThreeNUM {

    public static int findLargest(int a, int b) {
        return a > b ? a : b;
    }
    public static void main(String args[]) {

       DataInputStream din= new DataInputStream(System.in);

        int a,b,c;
	try{
        System.err.println("Enter three numbers : ");

        a = Integer.parseInt(din.readLine());
        b = Integer.parseInt(din.readLine());
        c = Integer.parseInt(din.readLine());;

        int largest = findLargest(a, findLargest(b,c));

        System.out.println("Greater is : "+largest);
	}
	catch (Exception e)
	{	
		 System.out.println("Errors : "+e);
	}

    }
}