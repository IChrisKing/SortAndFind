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
		begin = 0;
		while(d>1){
			end = begin+d;
			while(end<array.length && begin<d){
				insertSortPart(begin,d);
//				InsertSort.insertSortPart(array,begin,end);
				begin = begin++;
				end=begin+d;
			}
			d=d/2;
		
//		InsertSort.insertSortPart(array,1,array.length);
		insertSortPart(0,array.length);
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

	  public static void insertSortForShell(int begin, int d){    
	      int temp=0;   
	      for(int i=begin+d;i<array.lenth;i+=d){   
	         int j=i-d;   
	        temp=array[i];   
	        for(;j>=0&&temp<array[j];j-=d){   
	            array[j+d]=array[j];  //将大于temp 的值整体后移一个单位   
	        }   
	        array[j+d]=temp;   
	     }   
	 } 

}
