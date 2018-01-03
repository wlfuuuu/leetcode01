package leetcode_easy;

public class Roman {
	// int to roman
	public static String intToRoma(int num) {
		String[][] romanArray = {
				{"","I","II","III","IV","V","VI","VII","VIII","IX"}	,
				{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"} ,
				{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"} ,
				{"","M","MM","MMM"}
		};
		StringBuffer romaString = new StringBuffer("");
		int thousand = num/1000%10;
		String thousandStr = romanArray[3][thousand];
		romaString.append(thousandStr);
		romaString.append(romanArray[2][num/100%10]);
		romaString.append(romanArray[1][num/10%10]);
		romaString.append(romanArray[0][num%10]);
		
//		String roma = new String(romaString);
		String roma = romaString.toString();
		return roma;
	}
	
	// roman to int
	public static int romaToInt(String s) {
		// I : 1
		// V : 5 
		// X : 10
		// L : 50
		// C : 100
		// D : 500
		// M : 1000
		int length = s.length();
		if(length == 0){
			return 0 ;
		}
		int romaSum = 0;
		// 循环内计算除了最后一位之和
		for (int i = 0; i < length - 1; i++){
			int romaToNum1 = romaToNum(s.charAt(i));
			int romaToNum2 = romaToNum(s.charAt(i + 1));
			if(romaToNum1 >= romaToNum2){
				romaSum += romaToNum1;
			}else{
				romaSum -= romaToNum1;
			}
		}
		// 将最后一位加上算出结果
		romaSum += romaToNum(s.charAt(length - 1));
		return romaSum;
		
	}
	
	// 数字变罗马字符
	public static int romaToNum(char s){
		switch(s){
			case 'I' : return 1 ;
			case 'V' : return 5 ;
			case 'X' : return 10 ;
			case 'L' : return 50 ;
			case 'C' : return 100 ;
			case 'D' : return 500 ;
			case 'M' : return 1000 ;
		}
			return 0;
	}
	
	// 测试
	public static void main(String[] args) {
//		int sum = romaToInt("IV");
//		int sum1 = romaToInt("LXVI");
//		int sum2 = romaToInt("IV");
//		int sum3 = romaToInt("IV");
//		int sum4 = romaToInt("IV");
//		System.out.println(sum);
//		System.out.println(sum1);
		
		String str = intToRoma(3347);
		System.out.println(str);
	}
}
