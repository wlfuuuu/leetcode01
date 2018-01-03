package leetcode_easy;

import java.util.HashMap;

public class twoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	        HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
	        int[] res = new int[2];
	        for (int i = 0; i < nums.length; i++) {
	            m.put(nums[i], i);
	            
	        }
	       
	        // 1 0    3 1    5 2
	        for (int i = 0; i < nums.length; ++i) {
	            int t = target - nums[i];
	            if (m.containsKey(t) && m.get(t) != i) {
	                res[0] = i;
	                res[1] = m.get(t);
	                break;
	            }
	        }
	        return res;
	    }
	 public static void main(String[] args) {
		int[] i = {1,3,5};
		int[] p = twoSum(i,9);
		System.out.println(p[0]);
		System.out.println(p[1]);
	}
}
