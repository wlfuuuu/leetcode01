package leetcode_easy;

public class longestCommonPrefixStringByIndexof {
	public static String longestCommonPrefixStringByIndexof(String[] strs) {
		// indexof 返回值是 匹配字符串首位的索引 利用返回值是否为0 判断是否是公共前缀
		String commonPrefix = strs.length == 0 ? "" : strs[0];
		for(int i = 1; i < strs.length; ++i){
			int length = commonPrefix.length();
			for(int j = 0; j < length; ++j){
				if(strs[i].indexOf(commonPrefix) != 0){
					commonPrefix = commonPrefix.substring(0,commonPrefix.length() - 1);
				}else{
					return commonPrefix;
				}
			}
		}
		return commonPrefix;
	}
	
	public static void main(String[] args) {
		// common prefix string is ""
		String[] strs = {"abc","fabe","eabb"};
		String longestCommonPrefix = longestCommonPrefixStringByIndexof(strs);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix);
		
		// common prefix string is "" by strs is ""
		String[] strs1 = {""};
		String longestCommonPrefix1 = longestCommonPrefixStringByIndexof(strs1);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix1);
		
		// common prefix string is "ab"
		String[] strs2 = {"ab","abc"};
		String longestCommonPrefix2 = longestCommonPrefixStringByIndexof(strs2);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix2);
		
		// common prefix string is ""
		String[] strs3 = {"aca","cba"};
		String longestCommonPrefix3 = longestCommonPrefixStringByIndexof(strs3);
		System.out.println("longestCommonPrefix:"+longestCommonPrefix3);
	}
}
