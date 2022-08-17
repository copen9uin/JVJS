
public class VarEx3_2 {

	public static void main(String[] args) {
		//문자와 문자열
		
		char ch = 'a';	//문자 a
		System.out.println(ch);

		int i = 'a';	//문자 a의 문자 코드를 저장
		System.out.println(i);
		
		//char ch1 = 'ab'; 문자는 한가지만 저장 가능
		
		String str = "";	//빈 문자열
		String str2 = "ABC";
		String str3 = "123";
		String str4 = str2 + str3;	//문자열 결합
		System.out.println(str4);
		
		System.out.println(""+7+7);	//순서의 차이
		System.out.println(7+7+"");
	}

}
