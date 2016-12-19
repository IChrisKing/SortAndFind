package com.example.sortAndSearch;

public class MergeSort {
	static int[] array;
//	static int left,right,mid;
	public static void sortArray(int[] arr){
		array = arr;
		sort(0,array.length-1);
	}
	private static void sort(int left, int right) {
		// TODO Auto-generated method stub
		if(left<right){
			int center = (left+right)/2;
			sort(left,center);
			sort(center+1,right);
			merge(left,center,right);
		}
	}
	private static void merge(int left, int center, int right) {
		// TODO Auto-generated method stub
		int[] tmpArr = new int[array.length];
		int tmpTag = left;
		int leftTag = left;
		int rightTag = center+1;
		while(leftTag<=center && rightTag<=right){
			if(array[leftTag]<array[rightTag]){
				tmpArr[tmpTag]=array[leftTag];
				tmpTag++;
				leftTag++;
			}else{
				tmpArr[tmpTag]=array[rightTag];
				tmpTag++;
				rightTag++;
			}
		}
		
		while(leftTag<=center){
			tmpArr[tmpTag]=array[leftTag];
			tmpTag++;
			leftTag++;
		}
		while(rightTag<=right){
			tmpArr[tmpTag]=array[rightTag];
			tmpTag++;
			rightTag++;
		}
		
		tmpTag = left;
		while(tmpTag<=right){
			array[tmpTag]=tmpArr[tmpTag];
			tmpTag++;
		}
	}
}
