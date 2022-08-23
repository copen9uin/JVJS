import java.util.Scanner;	// import문부터 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// Scanner를 이용해 화면으로부터 입력받기
		
		Scanner scanner = new Scanner(System.in);	// Scanner 클래스의 객체 생성
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num3 = Integer.parseInt(input);
		
		System.out.println(num3);
	}

}
