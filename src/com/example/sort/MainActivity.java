package com.example.sort;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {
	public int[] array = new int[]{7,15,3,65,9,247,9,2,6,13,43,98,295,0,1,345};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		//直接插入排序
//		InsertSort.sortArray(array);
		
		//希尔排序
//		ShellSort.sortArray(array);
		
		//简单选择排序
//		SelectSort.sortArray(array);
		
		//堆排序
//		HeapSort.sortArray(array);

		//冒泡排序
		BubbleSort.sortArray(array);
		printArray();
	}


	private void printArray() {
		// TODO Auto-generated method stub
		for(Integer it:array){
			Log.d("jin",it.toString());

		}
	}





}
