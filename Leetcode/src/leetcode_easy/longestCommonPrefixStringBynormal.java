package leetcode_easy;

public class longestCommonPrefixStringBynormal {
	public static String longestCommonPrefix(String[] strs) {
		// strs length = 0 return ""
		String longestStr = strs.length == 0 ? "" : strs[0]; 
		for(int i = 0; i < strs.length; ++i ){
			longestStr = commonPrefix(longestStr,strs[i]);
		}
		return longestStr;
    }
	
	public static String commonPrefix(String longestStr,String next) {
		// loop use min length
		int loop = longestStr.length() > next.length() ? next.length() : longestStr.length();
		StringBuffer commonPrefix = new StringBuffer("");
		for(int i = 0; i < loop; ++i){
			char longestCommonPrefix = longestStr.charAt(i);
			// compare every char 
			if(longestCommonPrefix == next.charAt(i)){
				commonPrefix.append(longestCommonPrefix);
			}else{
				return commonPrefix.toString();
			}
		}
		return commonPrefix.toString();
	}
	
	// Test
	public static void main(String[] args) {
		// common prefix string is ""
		String[] strs = {"abc","fabe","eabb"};
		String longestCommonPrefix = longestCommonPrefix(strs);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix);
		
		// common prefix string is "" by strs is ""
		String[] strs1 = {""};
		String longestCommonPrefix1 = longestCommonPrefix(strs1);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix1);
		
		// common prefix string is "ab"
		String[] strs2 = {"ab","abc"};
		String longestCommonPrefix2 = longestCommonPrefix(strs2);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix2);
		
		// common prefix string is "ab"
		String[] strs3 = {"aca","cba"};
		String longestCommonPrefix3 = longestCommonPrefix(strs3);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix3);
	}
}
