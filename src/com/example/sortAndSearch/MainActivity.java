package com.example.sortAndSearch;


import java.util.HashSet;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {
	public int[] sortArray = new int[]{7,15,3,65,9,247,9,2,6,13,43,98,295,0,1,345};
//	public int[] searchArray = new int[]{7,15,3,65,9,247,9,2,6,13,43,98,295,0,1,345,2,6,13,43,9};

	public int[] searchArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,25,68,123};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		//直接插入排序
//		InsertSort.sortArray(sortArray);
		
		//希尔排序
//		ShellSort.sortArray(sortArray);
		
		//简单选择排序
//		SelectSort.sortArray(sortArray);
		
		//堆排序
//		HeapSort.sortArray(sortArray);

		//冒泡排序
//		BubbleSort.sortArray(sortArray);
		
		//快速排序
//		QuickSort.sortArray(sortArray);
		
		//归并排序
//		MergeSort.sortArray(sortArray);
		
//		printArray(sortArray);
		
		
		
		
		//顺序查找
//		HashSet<Integer> result = SequelSearch.searchInArray(searchArray, 9);
//		printHashSet(result);
		
		//二分查找
		int result = BinarySearch.searchInArray(searchArray, 9);
		Log.d("jin",String.valueOf(result));

	}


	private void printHashSet(HashSet<Integer> result) {
		// TODO Auto-generated method stub
		for(Integer it:result){
			Log.d("jin",it.toString());
		}
	}


	private void printArray(int[] array) {
		// TODO Auto-generated method stub
		for(Integer it:array){
			Log.d("jin",it.toString());

		}
	}





}
