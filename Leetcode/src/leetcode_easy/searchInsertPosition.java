package leetcode_easy;

public class searchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target <= nums[i]) {
				index = i;
				break;
			}else {
				index++;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int target = 0;
		int count = searchInsert(nums,target);
		System.out.println(count);
	}
}
