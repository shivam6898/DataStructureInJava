package com.app.code;

public class MergeSort {

	int[] array;
	int[] tempArray;
	int length;
	public static void main(String[] args) {
		int[] inputArray= {46,36,13,52,19,94,21};
		MergeSort ms =new MergeSort();
		ms.sort(inputArray);
		for (int i : inputArray) {
			System.out.println(i);
		}

	}

	private void sort(int[] inputArray) {
		this.array=inputArray;
		this.length=inputArray.length; 
		this.tempArray=new int[length];
		divideArray(0, length-1);
	}


	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;

			//sort left side of array
			divideArray(lowerIndex, middle);
			//sort right side of array
			//middle+1 becoz righ side ki value middle+1 index se shuru hogi.
			divideArray(middle+1, higherIndex);
			//divide completed now merge
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		//copy the array to temp array
		for (int i = lowerIndex; i <= higherIndex;i++) {
			tempArray[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k =lowerIndex;
		while(i<=middle && j<=higherIndex) {
			if(tempArray[i]<=tempArray[j]) {
				array[k]=tempArray[i];
				i++;
			}else {
				array[k]=tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k]=tempArray[i];
			k++;
			i++;
		}
	}
}
