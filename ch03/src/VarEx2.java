
public class VarEx2 {
	public static void main(String[] args) {
		//���� ������
		
		int i = 5, j = 0;
		
		j = i++;	//������
//		j = i;
//		i++;
		
		System.out.println("j=i++; ���� ��, i=" + i + ", j=" + j);
	
		
		i = 5; j = 0;	//���� �� ����
		j = ++i;	//������
//		i++;
//		j = i;
		
		System.out.println("i++; ���� ��, i=" + i + ", j=" + j);
		
		
		//��ȣ ������ 
		
		i = -10;
		i = -i;
		System.out.println(i);	//-��ȣ �����ڴ� �ǿ������� ��ȣ�� �ݴ�� �ٲ۴�.
	}
}
