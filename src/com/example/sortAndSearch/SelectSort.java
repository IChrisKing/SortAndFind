package com.example.sortAndSearch;

public class SelectSort {
	static int[] array;
	static int pos;
	
	public static void sortArray(int[] arr){
		array = arr;
		for(int i=0;i<array.length;i++){
			pos = findMinPos(i);
			int temp = array[i];
			array[i]=array[pos];
			array[pos]=temp;
		}
	}

	private static int findMinPos(int i) {
		// TODO Auto-generated method stub
		int min = array[i];
		int minPos = i;
		for(int j=i+1;j<array.length;j++){
			if(array[j]<min){
				min = array[j];
				minPos = j;
			}
		}
		return minPos;
	}

}
