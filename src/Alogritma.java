import java.util.Random;

public class Alogritma {
    public static void main(String[] args) {

        Random random = new Random();

        InsertionSort insertion_Sort = new InsertionSort();
        QuickSort quick_Sort = new QuickSort();
        BubbleSort bubble_Sort = new BubbleSort();
        SelectionSort selection_Sort = new SelectionSort();

        int[] array1 = new int[1000];
        int[] array2 = new int[1000];
        int[] array3 = new int[1000];
        int[] array4 = new int[1000];

        for (int i = 0; i < 1000; i++) {
            int d = random.nextInt(1000);
            array1[i] = d;
            array2[i] = d;
            array3[i] = d;
            array4[i] = d;

        }
        quick_Sort.quickSort(array2, 0, 999);
        bubble_Sort.bubbleSort(array1);
        insertion_Sort.sort(array3);
        selection_Sort.sort(array4);
        /*
        long starter = System.nanoTime();
        long end = System.nanoTime();
        System.out.println("Geçen süre : " + (end - starter) + "nanosaniye");
        */



    }
}
