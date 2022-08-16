import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class VarEx3_1 {

	public static void main(String[] args) {
		//변수와 리터럴
		
		boolean power = true;
		System.out.println(true);
		
		//boolean power1 = 0;	type mismatch error

		
		byte b = 127;	//byte 범위 -128~127
		
		int oct = 010;	// 8진수
		int hex = 0x10;	// 16진수
		System.out.println(oct);
		System.out.println(hex);

		long l = 1000_000_000;
		System.out.println(l);
		
		long l1 = 10_000_000_000L;
		System.out.println(l1);
		
		float f = 3.14f;
		double d = 3.14;
		
		System.out.println(10.);	//10.0
		System.out.println(.10);	//0.10
		System.out.println(10f);	//10.0
		System.out.println(1e3);	//1000.0
		
		
	}

}
