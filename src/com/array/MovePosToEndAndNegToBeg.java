package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovePosToEndAndNegToBeg {
	
	// move positive number to end and negative number to begining of array
	// Note : order is not important 

	public static void main(String[] args) {
		
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int size = arr.length-1;
		
		aprroach1(arr);
		approach2(arr);
		approach3(arr,size);
	}

	
	private static void approach3(int[] arr, int size) {
		int negsize = 0;
		int possize = 0;
		for(int i=0;i<=size;i++)
		{
			if(arr[i]<0) {
				negsize++;
			}
			else {
				possize++;
			}
		}
		for(int i=0;i<=size;i++)
		{   
			if(arr[i] < 0) {
				
			}
		}
		System.out.println(negsize + " " + possize);
		int[] negArr = new int[negsize];
		int[] posArr = new int[possize];
		
		
		System.out.println(Arrays.toString(negArr) );
	}


	private static void approach2(int[] arr) {
		List<Integer> array = IntStream.of(arr).boxed().collect(Collectors.toList());
		Collections.sort(array);
		System.out.println(array);
	}

	// T.C = O(n)+O(n) = 2O(n)
	private static void aprroach1(int[] arr) {
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		List<Integer>  mlist = list.stream().filter(i -> i < 0).collect(Collectors.toList());
		List<Integer>  nlist = list.stream().filter(i -> i > 0).collect(Collectors.toList());
		list.clear();
		list.addAll(mlist);
		list.addAll(nlist);
		System.out.println(list);
	}
}
