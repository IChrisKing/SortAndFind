package com.example.sortAndSearch;

import java.util.HashSet;

public class BinarySearch {

	static int[] array;
	static int value;
//	int mid;
	
	public static int searchInArray(int[] arr, int val){
		array = arr;
		value = val;
		int result = binarySearch(0,array.length-1);
		return result;
	}

	//递归方式
//	private static int binarySearch(int low, int high) {
//		// TODO Auto-generated method stub
//		int mid = (low + high)/2;
//		if(low<=high){
//			if(array[mid] == value){
//				return mid;
//			}else if(array[mid] < value){
//				binarySearch(mid+1, high);
//			}else{
//				binarySearch(low, mid-1);
//			}
//		}
//		
//		return -1;
//	}
	
	//递推方式
	private static int binarySearch(int low, int high) {
		// TODO Auto-generated method stub
		int mid = (low + high)/2;
		while(low<high){
			if(array[mid] == value){
				return mid;
			}else if(array[mid] < value){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		
		return -1;
	}
	
}
