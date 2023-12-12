import java.io.*;

class SortArray {

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String args[]) {

        DataInputStream din = new DataInputStream(System.in);

        try {
            System.err.println("Enter the size of the array: ");
            int size = Integer.parseInt(din.readLine());

            int[] array = new int[size];

            System.err.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(din.readLine());
            }
            sortArray(array);
            System.out.println("Sorted array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Errors: " + e);
        }
    }
}
