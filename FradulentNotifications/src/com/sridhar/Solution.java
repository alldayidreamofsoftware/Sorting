package com.sridhar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	
	public void insertionSort(int[] data) {
		int j,i;
		
		for(i = 1; i < data.length; i++) {
			Integer key = data[i];
			for(j = i-1 ; j >= 0 ; j--) {
				if(key < data[j]) {
					data[j+1]=data[j];
 				}
			}
			data[j+1] =key;
		}
	}
		
	public int[] countingSort(int[] data, int range) {
		
		int[] count = new int[range+1];
		int[] temp = new int[data.length];
		
		for(int i = 0 ; i < data.length ; i++) {
			count[data[i]]++;
		}
		for(int i = 1; i < count.length ; i++) {
			count[i] = count[i] + count[i-1];
		}
		for(int i = 0 ; i < data.length ; i++) {
			int pos = count[data[i]];
			temp[pos-1] = data[i];
		}
		return temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] data = new int[n];
		int max = 0;
		for(int i = 0 ; i < n ; i ++) {
			data[i] = scanner.nextInt();
			if(max < data[i])
				max = data[i];
		}
		for(int i = 0 ; i < n ; i ++) {
			System.out.printf("%d ",data[i]);
		}
		System.out.println();
		int[] temp = sol.countingSort(data,max);
		scanner.close();
		for(int i = 0 ; i < n ; i ++) {
			System.out.printf("%d ",temp[i]);
		}

	}

}
