package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {

		Activity4 actObj = new Activity4();

		// create the unsorted array
		int[] nums = { 10, 9, 20, 15, 5, 14 };
		
		// call the function to sort the array
		actObj.insertionSorts(nums);

		System.out.println("Sorted Out:" + Arrays.toString(nums));

	}

	public void insertionSorts(int[] nums) {
		// set the size of array
		int size = nums.length;
		// loop the array
		// starting the second value

		for (int i = 1; i < size; i++) {
			// set the key value and first compare value
			int key = nums[i];
			int j = i - 1;

			// check the key is lesser, if it is swap it
			while (j >= 0 && key < nums[j]) {
				nums[j + 1] = nums[j];
				--j;
			}

			// Make the next value the key
			nums[j + 1] = key;

		}
	}
}
