package com.abnamro.mulb;

import java.util.ArrayList;

public class ShortingNameAge {

	public static void main(String[] args) {
	    Integer[] nums= {1,3,-1,-3,5,3,6,7};
	    int slidingWindow = 3;
	    ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i <= nums.length - slidingWindow; i++) {
			int max = nums[i];
			for (int j = i + 1; j < i + slidingWindow; j++) {
				if (nums[j] > max) {
					max = nums[j];
				}
			}
			ar.add(max);
		}

		System.out.println(ar);
	}
}