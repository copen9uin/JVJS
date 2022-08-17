
public class VarEx2 {

	public static void main(String[] args) {
		//두 변수의 값 교환
		
		int x = 4, y = 2;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
