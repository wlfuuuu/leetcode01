package leetcode_easy;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		if(nums == null || nums.length == 0) {
			return 0 ;
		}
		int index = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(val != nums[i]) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int sum = removeElement(nums,3);
		System.out.println(sum);
	}
}
