
public class VarEx12 {

	public static void main(String[] args) {
		//타입 간의 변환
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	//문자열 ->문자->숫자
		System.out.println('3' - '0' + 1); //문자 ->숫자
		System.out.println(Integer.parseInt(str) + 1); //문자열->숫자(int)
		System.out.println("3" + 1); //문자열 + 숫자 = 문자열 "31"
		System.out.println(3 + '0'); //0이 숫자로 48이여서 3+48=51
		System.out.println((char)(3 + '0')); //형변환을 해야 숫자->문자
		

	}

}
