package com.example.sort;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {
	public int[] array = new int[]{7,15,3,65,9,247,9,2,6};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		InsertSort insertSort = new InsertSort(array);
//		InsertSort.sortArray(array);
//		InsertSort.insertSort(array);
//		InsertSort.insertSortPart(array, 1, array.length);
		
		ShellSort.sortArray(array);
		
		printArray();
	}


	private void printArray() {
		// TODO Auto-generated method stub
		for(Integer it:array){
			Log.d("jin",it.toString());

		}
	}





}
