package leetcode_easy;

public class isPalindrome {
	public static boolean isPalindrome(int x) {
		if(x<0){
			return false;
		}
		int length=String.valueOf(x).length();
		int count = length / 2;
		int yushu = length % 2;
		int i1 = 0;
		int i2 = x;
		for (int i = 0; i < count; i++) {
			i1 = i1 * 10 + i2 % 10;
			i2 = i2 / 10;
		}
		if (yushu == 1) {
			i2 = i2 / 10;
		}
		if (i1 == i2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean f = isPalindrome(3214123);
		System.out.println(f);
	}
	
	
}
