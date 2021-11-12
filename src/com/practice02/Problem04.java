package com.practice02;

public class Problem04 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		double cnt = 0;
		for(int i = 0; i<6; i++) {
			arr[i] = (int)(Math.random()*45)+1;

			for (int j = 0 ; j<i ; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
				
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
//			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for (int a : arr) {
			System.out.print(a+" ");
		}
    }
}