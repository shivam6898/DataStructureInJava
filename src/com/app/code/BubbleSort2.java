package com.app.code;

public class BubbleSort2 {
	
	public static void main(String[] args) {
		int[] A= {-25,-10,-15,10,20,50,0,100};
		System.out.println("Before Sorting...");
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		
		
		for (int i = 0; i < A.length-1; i++) {
			for (int j = 0; j < A.length-1-i; j++) {
				if(A[j]>A[j+1]) {
					int temp=A[j+1];
					 A[j+1]=A[j];
					 A[j]=temp;
				}
			}
			
		}
		
		System.out.println("After  Sorting...");
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

	}

}
