package leetcode_easy;

import java.util.HashMap;
import java.util.Map;


public class Solution {
	
	// ֻ�ܷ��س���
	public static int remove2(int[] nums) {
			if(nums.length == 0) {
				return 0;
			}
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i = 0; i < nums.length; i++) {
				int j = nums[i];
				if(map.get(j) == null) {
					map.put(j, j);
				}
	        }
	        return map.size() ;
	}
	
	//ά��һ���µ�����index����
	public int removeDuplicates(int[] nums) {  
		if(nums == null || nums.length == 0) {
			return 0 ;
		}
		int index = 1;
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i] != nums[i-1]) {
				nums[index] = nums[i];
				index++ ;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int sum = remove2(nums);
		System.out.println(sum);
	}
}
