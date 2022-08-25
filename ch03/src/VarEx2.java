
public class VarEx2 {
	public static void main(String[] args) {
		//증감 연산자
		
		int i = 5, j = 0;
		
		j = i++;	//후위형
//		j = i;
//		i++;
		
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
	
		
		i = 5; j = 0;	//값을 재 설정
		j = ++i;	//전위형
//		i++;
//		j = i;
		
		System.out.println("i++; 실행 후, i=" + i + ", j=" + j);
		
		
		//부호 연산자 
		
		i = -10;
		i = -i;
		System.out.println(i);	//-부호 연산자는 피연산자의 부호를 반대로 바꾼다.
	}
}
