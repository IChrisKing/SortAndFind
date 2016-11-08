package com.example.sort;

public class BubbleSort {
	public static int[] array;
	
	public static void sortArray(int[] arr){
		array = arr;
		for(int i=0;i<array.length;i++){
			bubble(i);
		}
	}

	private static void bubble(int i) {
		// TODO Auto-generated method stub
		int tag=array.length-1;
		while(tag>i){
			if(array[tag]<array[tag-1]){
				swap(tag,tag-1);
			}
			tag--;
		}
	}
	
	private static void swap(int i, int end) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
	}

}
