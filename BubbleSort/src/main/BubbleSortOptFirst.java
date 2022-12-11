package main;

public class BubbleSortOptFirst {

    public int[] bubbleSortOptFirst(int[] arr) {
        long start = System.nanoTime();

        boolean didItSwap = true;
        int arrayToSort = arr.length-1;

        while(didItSwap) {

            didItSwap = false;

            for (int i = 0; i < arrayToSort; i++) {
                /* "i < arr.length-1" because we will compare an element i with the following element,
                 * so we fo not want the loop to go to the last element as there would not be another one to compare it with. */
                if(arr[i] > arr[i+1]) {
                    didItSwap = true;

                    //create variables (but can just use one variable e.g. "temp"
                    int valueI = arr[i];
                    int valueI1 = arr[i+1];

                    //swap
                    arr[i] = valueI1;
                    arr[i+1] = valueI;
                }
            }

            arrayToSort -= 1;
        }

        long end = System.nanoTime();
        long elapsedTime = end - start;
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;
        System.out.println("main.BubbleSort Opt1: " + elapsedTimeInSecond);

        return arr;
    }

}
