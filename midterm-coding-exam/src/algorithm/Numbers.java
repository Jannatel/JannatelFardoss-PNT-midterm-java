package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		System.out.println("Started...");
		int [] num = new int[1000000];	//1000000
		storeRandomNumbers(num);

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();

		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);


		int n = num.length;
		randomize (num, n);

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Bubble Sort
		randomize (num, n);
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		//printArray(num);

		//Heap Sort
		randomize (num, n);
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		//printArray(num);

		//Merge Sort
		randomize (num, n);
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		//printArray(num);

		//Bucket Sort
//		randomize (num, n);
//		algo.bucketSort(num);
//		long bucketSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		//printArray(num);

		//By following above, Continue for rest of the Sorting Algorithm....









		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		System.out.println("Generating Random Numbers...");
		int c=0;
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			c++;
			if(c>10000) {
				System.out.print(".");
				c = 0;
			}
			num[i] = rand.nextInt(1000000);
		}
		System.out.println("/");
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}

	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
