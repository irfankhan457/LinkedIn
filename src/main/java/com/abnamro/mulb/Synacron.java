package com.abnamro.mulb;

public class Synacron {

	public static void main(String[] args) {
//		 int[] array = {7,9,19,11,13};
		int[] array = {7,9,11,13,19};
		 
		 boolean flag = true;
		 for(int i =0; i<array.length-1;i++) {
			if(array[i] > array[i+1]) {
				flag = false;
				break;
			}
		}
		 if(flag) {
			 System.out.println("Array is sorted");
		 }else {
			 System.out.println("Array is not sorted");
		 }

	}

}
