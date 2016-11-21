package com.example.sortAndSearch;

public class HeapSort {
	public static int[] array;
	static int end;
	
	public static void sortArray(int[] arr){
		array = arr;
		end = array.length - 1;
		for(int i=0;i<array.length-1;i++){
			buildMaxHeap(end);
			swap(0,end);
			end--;
		}
	}

	private static void swap(int i, int end) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
	}

	private static void buildMaxHeap(int end) {
		// TODO Auto-generated method stub
		int biggerIndex = 0;
		//从最后一个节点的父节点开始
		for(int j = (end-1)/2;j>=0;j--){
			//k标记当前比较的节点
			int k = j;
			//当节点的左孩子存在时
			while(k*2+1<=end){
				//现假设左孩子是两个孩子中的较大者
				biggerIndex = k*2+1;
				//查看右孩子是否存在
				if(biggerIndex+1<=end){
					//查看左右孩子哪个更大
					if(array[biggerIndex]< array[biggerIndex+1]){
						//如果右孩子更大，更改biggerIndex，使它指向右孩子
						biggerIndex++;
					}
				}
				
				//查看当前节点和孩子中的较大节点哪个更大
				if(array[k]<array[biggerIndex]){
					//如果孩子中的较大节点更大，交换当前节点和较大孩子节点的值
					swap(k,biggerIndex);
					//把较大孩子节点作为下一次while的当前节点，来考察经过一次交换之后，有没有影响到子树的正确性。
					k=biggerIndex;
				}else{
					break;//没有交换操作，则不需要检查子树的正确性
				}
			}
		}
	}
	
}
