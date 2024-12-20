package activities;

public class Activity2 {
	
	public static void main(String[] args) {
		//create obj for the class
	Activity2 actObj= new Activity2();

		//Create an integer code
		int[] nums = {10, 77, 10, 54, -11, 10};
		
		//set number for search
		int searchNum=10;
		int fixedSum=30;		
		
		//call the result function and print the result
		System.out.println("Result:" + actObj.result(nums, searchNum,fixedSum));

	}
	
	public boolean result(int[] nums, int searchNum, int fixedSum) {
		//temp variable to calculate the loop
		int tempSum=0;
		
		//Loop for array to calculate sum
		for(int number : nums ) {
			//check if the value is searchNum
			if(number == searchNum) {
				//Add the value
				tempSum += searchNum;
				
			}
			//check if tempSum is greater than fixed Sum
			if(tempSum > fixedSum) {
			break;
			
			}
		}
	return	fixedSum == tempSum;
	
		
	}
}
