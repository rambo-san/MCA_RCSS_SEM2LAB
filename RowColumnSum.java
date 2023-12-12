import java.io.*;

class RowColumnSum {

    public static void main(String args[]) {

        DataInputStream din = new DataInputStream(System.in);

        try {
            System.err.println("number of rows: ");
            int rows = Integer.parseInt(din.readLine());

            System.err.println("number of columns: ");
            int columns = Integer.parseInt(din.readLine());

            int[][] array = new int[rows][columns];

            System.err.println("Enter the elements of array: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = Integer.parseInt(din.readLine());
                }
            }

            System.out.println("Row sum:");
            for (int i = 0; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < columns; j++) {
                    rowSum += array[i][j];
			System.out.print(array[i][j]+" ");
                }
                System.out.println("|" + rowSum);
            }

            for (int j = 0; j < columns; j++) {
                int columnSum = 0;
                for (int i = 0; i < rows; i++) {
                    columnSum += array[i][j];
                }
                System.out.print(columnSum + " ");
            }

        } catch (Exception e) {
            System.out.println("Errors: " + e);
        }
    }
}
