
public class VarEx1 {

	public static void main(String[] args) {
		// ����ȯ
		
		double d = 3.14;
		int score = (int)d;
		System.out.println(score);
		
		char c = (char)65;	//int -> char (�����ڵ� ǥ�� ���� 65=A��ȯ)
		System.out.println(c);
		int c1 = (int)'A';	//char -> int
		System.out.println(c1);
		
		float f = (float)10;	// int -> float
		System.out.println(f);
		int f1 = (int)1.6f;		// float -> int
		System.out.println(f1);	//�Ҽ��� �Ʒ� ���� (�ݿø�X)
		
		
		//�ڵ�����ȯ
		
		float f2 = 1234;
		System.out.println(f2);		// int -> float �ڵ� ����ȯ
		
		byte b = 100;		// byte ������ -128~127�̶� ����
		System.out.println(b);		// int -> byte �ڵ� ����ȯ
		
		int i = 100;
//		byte b1 = i;	i�� ���ͷ��� �ƴ϶� �����̱� ������ �ڵ�����ȯ �Ұ���
		byte b1 = (byte)i;	//���� ����ȯ�� ����
		System.out.println(b1);

//		byte b2 = 1000;		byte�� ������ ����� ������ ����
		byte b2 = (byte)1000;	//������ �߻����� ������ ���ս��� �߻�
		System.out.println(b2);
		
	}

}
