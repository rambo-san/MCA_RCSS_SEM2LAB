import java.io.*;

class SearchInArray {

    public static int searchElement(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Element not found
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

            System.err.println("Enter the element to search: ");
            int key = Integer.parseInt(din.readLine());

            int result = searchElement(array, key);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        } catch (Exception e) {
            System.out.println("Errors: " + e);
        }
    }
}
