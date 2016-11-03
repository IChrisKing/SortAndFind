package com.example.sort;

public class ShellSort {
	static int[] array;
	static int d;
	static int begin;
	static int end;
	
	ShellSort(){
//		InsertSort insertSort = new InsertSort(arr);

	}
	
	public static void sortArray(int[] arr){
		array = arr;
		d=arr.length/2;
		begin = 1;
		while(d>1){
			end = begin+d;
			while(end<array.length){
				insertSortPart(begin,end);
//				InsertSort.insertSortPart(array,begin,end);
				begin = end+1;
				end=begin+d;
			}
			d=d/2;
		}
//		InsertSort.insertSortPart(array,1,array.length);
		insertSortPart(1,array.length);
	}
	
	  public static void insertSortPart(int begin, int end){    
	      int temp=0;   
	      for(int i=begin;i<end;i++){   
	         int j=i-1;   
	        temp=array[i];   
	        for(;j>=0&&temp<array[j];j--){   
	            array[j+1]=array[j];  //将大于temp 的值整体后移一个单位   
	        }   
	        array[j+1]=temp;   
	     }   
	 } 

}
