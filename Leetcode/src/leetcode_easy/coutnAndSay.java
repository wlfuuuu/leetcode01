package leetcode_easy;

public class coutnAndSay {
	public static String countAndSay(int n) {
		String s = "";
		if(1 == n) {
			return s = "1";
		}
		// 从n = 1 开始进行递归
		// n = 1 时 countAndSay返回1 
		// n = 2 时 countAndSay(1) = 1 则str = 1* 返回11
		// n = 3 时 countAndSay(2) = 11 则str = 11* 返回21
		// 末尾添加*来补位,便于c[i] == c[i + 1]的判断
		String str = countAndSay(n - 1) + "*";
		char[] c = str.toCharArray();
		int count = 1;
		for(int i = 0 ; i < c.length - 1 ; i++) {
			if(c[i] == c[i + 1]) {
				count++;
			}else {
				s = s + count + c[i];
				count = 1;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
//		System.out.println(countAndSay(1));
		System.out.println(countAndSay(8));
	}
}
