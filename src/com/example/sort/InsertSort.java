package com.example.sort;

public class InsertSort {
	static int[] array;
	static int sum;
	static int sorted_num;
	
//	public InsertSort() {
//		// TODO Auto-generated constructor stub
////		array = arr;
//	}
	
	//我的实现
	public static void sortArray(int[] arr){
		array = arr;
		sum = array.length;
		sorted_num = 1;

		for(int i = 1;i<sum;i++){
			sort(sorted_num);
			sorted_num++;
		}
		
	}

	public static void sort(int sorted){
		Integer number = array[sorted];
		for(int j = 0;j<sorted;j++){
			if(number < array[j]){
				for(int k=sorted;k>j;k--){
					array[k]= array[k-1];			
				}
				array[j]= number;
				break;
			}else{continue;}
		}
	}

	//更简洁的实现
	  public static void insertSort(int[] arr){    
			array = arr;
	      int temp=0;   
	      for(int i=1;i<array.length;i++){   
	         int j=i-1;   
	        temp=array[i];   
	        for(;j>=0&&temp<array[j];j--){   
	            array[j+1]=array[j];  //将大于temp 的值整体后移一个单位   
	        }   
	        array[j+1]=temp;   
	     }   
	 }   
	  
//	  public static void insertSortPart(int[] arr,int begin, int end){    
//			array = arr;
//	      int temp=0;   
//	      for(int i=begin;i<end;i++){   
//	         int j=i-1;   
//	        temp=array[i];   
//	        for(;j>=0&&temp<array[j];j--){   
//	            array[j+1]=array[j];  //将大于temp 的值整体后移一个单位   
//	        }   
//	        array[j+1]=temp;   
//	     }   
//	 } 
}
