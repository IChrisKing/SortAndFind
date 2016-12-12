package com.example.sortAndSearch;

public class QuickSort {
	static int[] array;
	static int cmp;

	public static void sortArray(int[] arr){
		array=arr;
		sort(0,array.length-1);
	}

	private static void sort(int low, int high) {
		// TODO Auto-generated method stub
		if(low<high){
			int middle =getMiddle(low, high);  
            sort(low, middle - 1);       //对低字表进行递归排序     
            sort(middle + 1, high);       //对高字表进行递归排
		}
	}
	
	public static int getMiddle(int low, int high) {     
             int tag =array[low];    //数组的第一个作为中轴     
             while (low < high){     
                 while (low < high&& array[high] >= tag) {     
                    high--;     
                 }     
                 array[low] =array[high];   //比中轴小的记录移到低端 
                 
                 while (low < high&& array[low] <= tag) {     
                     low++;     
                 }     
                 array[high] =array[low];   //比中轴大的记录移到高端     
             }     
            array[low] = tag;              //中轴记录到尾     
             return low;                   //返回中轴的位置     
 } 
 
}
