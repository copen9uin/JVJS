
public class VarEx3 {

	public static void main(String[] args) {
		int score = 100;
		score = 200;
		
		System.out.println(score);
		
		final int MAX = 100;
		//MAX = 200;			MAX는 상수이기 때문에 오류 발생
		System.out.println(MAX);
		System.out.println(MAX);
	}

}
