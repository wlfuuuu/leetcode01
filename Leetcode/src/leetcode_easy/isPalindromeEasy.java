package leetcode_easy;

public class isPalindromeEasy {
	public static boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0 )){
			return false;
		}
		int lastNum = 0;
		while(x > lastNum){
			lastNum = lastNum * 10 + x % 10;
			x = x / 10;
		}
		return x == lastNum || x == lastNum / 10 ;
	}

	public static void main(String[] args) {
		boolean f = isPalindrome(3214123);
		System.out.println(f);
	}
}
