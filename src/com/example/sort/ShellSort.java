package com.example.sort;

public class ShellSort {
	static int[] array;
	static int d;
	static int begin;
	
	ShellSort(){
//		InsertSort insertSort = new InsertSort(arr);

	}
	
	public static void sortArray(int[] arr){
		array = arr;
		d=arr.length/2;

		while(d>1){
			begin = 0;
			while(begin<d){
				insertSortForShell(begin,d);
				begin++;
			}
			d=d/2;
		}
		
		insertSortForShell(0,1);
	}
	

	  public static void insertSortForShell(int begin, int d){    
	      int temp;   
	      for(int i=begin+d;i<array.length;i+=d){   
	         int j=i-d;   
	        temp=array[i];   
	        for(;j>=0&&temp<array[j];j-=d){   
	            array[j+d]=array[j];  
	        }   
	        array[j+d]=temp;   
	     }   
	 } 

}
