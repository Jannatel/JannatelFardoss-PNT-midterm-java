package algorithm;
import java.util.*;
import java.util.Collections;
public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        System.out.println("Selection Sort in progress...");
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int c=0;
        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;

            c++;
            if(c>10000) {
                System.out.print(".");
                c = 0;
            }
        }
        System.out.println("/");
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n=list.length;
        int i, key, j;
        int c=0;
        for (i = 1; i < n; i++)
        {
            key = list[i];
            j = i - 1;

            while (j >= 0 && list[j] > key)
            {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;

            c++;
            if(c>10000) {
                System.out.print(".");
                c = 0;
            }
        }
        System.out.println("/");
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        mergeSplit(list, 0, list.length - 1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = list.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

           // call max heapify on the reduced heap
           heapify(list, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }





//    public int [] bucketSort(int [] array){
//        final long startTime = System.currentTimeMillis();
//        int [] list = array;
//        //implement here
//        int n = list.length;
//        if (n <= 0)
//            return list;
//
//        // 1) Create n empty buckets
//        Vector<Integer>[] buckets = new Vector[n];
//
//        for (int i = 0; i < n; i++) {
//            buckets[i] = new Vector<Integer>();
//        }
//
//        // 2) Put array elements in different buckets
//        for (int i = 0; i < n; i++) {
//            long idx = list[i] * n;
//            buckets[(long)idx].add(list[i]);
//        }
//
//        // 3) Sort individual buckets
//        for (int i = 0; i < n; i++) {
//            Collections.sort(buckets[i]);
//        }
//
//        // 4) Concatenate all buckets into arr[]
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < buckets[i].size(); j++) {
//                list[index++] = buckets[i].get(j);
//            }
//        }
//        final long endTime = System.currentTimeMillis();
//        final long executionTime = endTime - startTime;
//        this.executionTime = executionTime;
//
//        return list;
//    }
//
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    // Merge splitter function that sorts arr[l..r] using
    void mergeSplit(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            mergeSplit(arr, l, m);
            mergeSplit(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
