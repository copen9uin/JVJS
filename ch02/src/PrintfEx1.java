
public class PrintfEx1 {

	public static void main(String[] args) {
		// printf를 이용한 출력
		
		System.out.println(10/3); 	//정수/정수=정수
		System.out.println(10.0/3);
		System.out.println(0x1a);	//10진수로만 표현

		//정수
		System.out.printf("%d%n", 15);	// %d 10진수, \n,%n 개행문자 
		System.out.printf("%o%n", 15);	// %o 8진수
		System.out.printf("%x%n", 15);	// %x 16진수
		System.out.printf("%s%n", Integer.toBinaryString(15));	// 2진수
		
		System.out.printf("%#o%n", 15);	// # 접두어 표시 
		System.out.printf("%#x%n", 15);
		
		//실수
		float f = 123.4567890f;		// 정밀도 7자리
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f); //지수형식
		
		double d = 123.4567890;		// 정밀도 15자리
		System.out.printf("%f%n", d);
		System.out.printf("%e%n", d);
		
		System.out.printf("%g%n", 123.456789);	// f나 e중 간단한 형식으로 출력
		System.out.printf("%g%n", 0.00000001);
		
		//자리수 지정
		System.out.printf("[%5d]%n", 10);	// 5자리로 출력, 오른쪽 정렬
		System.out.printf("[%-5d]%n", 10);	// 왼쪽 정렬
		System.out.printf("[%05d]%n", 10);	// 빈칸을 0으로 채움
		System.out.printf("[%5d]%n", 1234567);	// 그 이상의 자릿수면 다 출력
		
		double d1 = 1.23456789;
		System.out.printf("%f%n", d1);
		System.out.printf("%14.10f%n", d1);		// 전체14자리, 소수점아래 10자리

		String s = "www.codechobo.com";
		System.out.printf("%s%n", s);
		System.out.printf("[%20s]%n", s);
		System.out.printf("[%-20s]%n", s);
		System.out.printf("[%.8s]%n", s);	// 8자리까지만 출력
	}

}
