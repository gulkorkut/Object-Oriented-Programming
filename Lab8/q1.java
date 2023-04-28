package lab112;

import java.util.Arrays;

public class Main {
    static void selectionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = array[i];
                array[i] = array[minElementIndex];
                array[minElementIndex] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    static void insertionSort(int[] array) {
        int size = array.length;
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < size; i++) {

            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;

            }

            array[j + 1] = key;
            System.out.println(Arrays.toString(array));


        }
    }

    public static void main(String args[]) {
        int[]unsorted1={15,4,32,6,8,14,92,11,83};
        int[]unsorted2={15,4,32,6,8,14,92,11,83};
        selectionSort(unsorted2);
        System.out.println("-----------------");
        insertionSort(unsorted1);


    }

}