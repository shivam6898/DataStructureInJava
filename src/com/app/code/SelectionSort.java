package com.app.code;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] intArray= {20,35,-15,7,55,1,22};
		
		//for each iteration we will get lastsorted index.
		for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			
			int largest=0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				// assume 1st index is largest , and if largest found then update to largest
				if(intArray[i]>intArray[largest]) { //if any element found largest then largest 
					largest=i;                      // then update largest
				}
				
				//swap largest to lastUnsortedIndex
				swap(intArray,largest,lastUnsortedIndex);
			}
		}
		
		System.out.println("After Sorting..");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void swap(int array[], int i, int j) {
		
	if(i==j) {
		return;
	}
	    int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	
	}
}
