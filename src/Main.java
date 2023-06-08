// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int array[] = new int[10];
        InputArray(array);

        OutputArray(array);

        SortArray(array);

        OutputArray(array);
    }

    public static void InputArray(int[] array) {
        Random random = new Random();
        for(int i = 0; i <  array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void OutputArray(int[] array) {
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void SortArray(int[] array) {

        int n = array.length;

        for(int i  = n / 2 - 1; i >= 0; i--)
            heapify(array, i , n);

        for (int i = n - 1; i >= 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] array, int i, int n) {

        int l = i * 2 + 1;

        int r = i * 2 + 2;

        int largest = i;

        if(l < n && array[l] > array[largest])
            largest = l;

        if(r < n && array[r] > array[largest])
            largest = r;

        if (i != largest){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, largest, n);
        }
    }
}