package com.example.sortAndSearch;

import java.util.HashSet;

public class SequelSearch {
	static int[] array;
	static int value;

	public static HashSet<Integer> searchInArray(int[] arr, int val){
		array = arr;
		value = val;
		HashSet<Integer> result = sequelSearch();
		return result;
	}

	private static HashSet<Integer> sequelSearch() {
		// TODO Auto-generated method stub
		HashSet<Integer> res = new HashSet<Integer>();
		for(int i=0;i<array.length;i++){
			if(array[i] == value){
				res.add(i);
			}
		}
		return res;
	}

}
