
public class VarEx1 {

	public static void main(String[] args) {
		// 형변환
		
		double d = 3.14;
		int score = (int)d;
		System.out.println(score);
		
		char c = (char)65;	//int -> char (유니코드 표에 의해 65=A변환)
		System.out.println(c);
		int c1 = (int)'A';	//char -> int
		System.out.println(c1);
		
		float f = (float)10;	// int -> float
		System.out.println(f);
		int f1 = (int)1.6f;		// float -> int
		System.out.println(f1);	//소숫점 아래 버림 (반올림X)
		
		
		//자동형변환
		
		float f2 = 1234;
		System.out.println(f2);		// int -> float 자동 형변환
		
		byte b = 100;		// byte 범위가 -128~127이라 가능
		System.out.println(b);		// int -> byte 자동 형변환
		
		int i = 100;
//		byte b1 = i;	i는 리터럴이 아니라 변수이기 때문에 자동형변환 불가능
		byte b1 = (byte)i;	//수동 형변환은 가능
		System.out.println(b1);

//		byte b2 = 1000;		byte의 범위를 벗어나기 때문에 오류
		byte b2 = (byte)1000;	//에러는 발생하지 않지만 값손실이 발생
		System.out.println(b2);
		
	}

}
