package leetcode_easy;

/**
 * @author hasee
 * Given a string, find the length of the longest substring without repeating characters
 * ���:��һ�ַ������ҳ��������û���ظ��ַ����Ӵ��������䳤��
 */
public class longestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		char[] c = s.toCharArray();
		// ���� ÿ����0
		int count = 0;
		// ��Ӵ��ĳ���
		int maxLength = 0;
		// �ظ�ֵ�����±�
		int priex = 0;
		// ��Ӵ�
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
					// �ظ�ֵ�����±�+1Ϊ��һ��ѭ�������
					priex += indexOfs + 1;
					// ������0
					count = 0;
					// ��Ӵ���0
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
