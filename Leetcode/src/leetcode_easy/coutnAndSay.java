package leetcode_easy;

public class coutnAndSay {
	public static String countAndSay(int n) {
		String s = "";
		if(1 == n) {
			return s = "1";
		}
		// ��n = 1 ��ʼ���еݹ�
		// n = 1 ʱ countAndSay����1 
		// n = 2 ʱ countAndSay(1) = 1 ��str = 1* ����11
		// n = 3 ʱ countAndSay(2) = 11 ��str = 11* ����21
		// ĩβ���*����λ,����c[i] == c[i + 1]���ж�
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
