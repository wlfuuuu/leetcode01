package leetcode_easy;

/**
 * @author hasee
 * Given a string, find the length of the longest substring without repeating characters
 * 题解:给一字符串，找出其中最长的没有重复字符的子串，返回其长度
 */
public class longestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		char[] c = s.toCharArray();
		// 计数 每次清0
		int count = 0;
		// 最长子串的长度
		int maxLength = 0;
		// 重复值所在下标
		int priex = 0;
		// 最长子串
		StringBuffer maxString = new StringBuffer("");
		for(int j = priex; j < c.length ; j++) {
			for(int i = priex; i < c.length ; i++) {
				int indexOfs = maxString.indexOf(String.valueOf(c[i]));
				if(indexOfs == -1) {
					count++;
					maxString.append(c[i]);
				}else {
					if(maxLength < count) {
						maxLength = count;
					}
					// 重复值所在下标+1为下一次循环的起点
					priex += indexOfs + 1;
					// 计数置0
					count = 0;
					// 最长子串置0
					maxString.setLength(0);
					break;
				}
			}
		}
		
		return maxLength > maxString.length() ? maxLength : maxString.length();
	}
	
	public static void main(String[] args) {
		int i = lengthOfLongestSubstring("abbac");
		System.out.println(i);
		
	}
}
