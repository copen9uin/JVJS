
public class PrintfEx1 {

	public static void main(String[] args) {
		// printf�� �̿��� ���
		
		System.out.println(10/3); 	//����/����=����
		System.out.println(10.0/3);
		System.out.println(0x1a);	//10�����θ� ǥ��

		//����
		System.out.printf("%d%n", 15);	// %d 10����, \n,%n ���๮�� 
		System.out.printf("%o%n", 15);	// %o 8����
		System.out.printf("%x%n", 15);	// %x 16����
		System.out.printf("%s%n", Integer.toBinaryString(15));	// 2����
		
		System.out.printf("%#o%n", 15);	// # ���ξ� ǥ�� 
		System.out.printf("%#x%n", 15);
		
		//�Ǽ�
		float f = 123.4567890f;		// ���е� 7�ڸ�
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f); //��������
		
		double d = 123.4567890;		// ���е� 15�ڸ�
		System.out.printf("%f%n", d);
		System.out.printf("%e%n", d);
		
		System.out.printf("%g%n", 123.456789);	// f�� e�� ������ �������� ���
		System.out.printf("%g%n", 0.00000001);
		
		//�ڸ��� ����
		System.out.printf("[%5d]%n", 10);	// 5�ڸ��� ���, ������ ����
		System.out.printf("[%-5d]%n", 10);	// ���� ����
		System.out.printf("[%05d]%n", 10);	// ��ĭ�� 0���� ä��
		System.out.printf("[%5d]%n", 1234567);	// �� �̻��� �ڸ����� �� ���
		
		double d1 = 1.23456789;
		System.out.printf("%f%n", d1);
		System.out.printf("%14.10f%n", d1);		// ��ü14�ڸ�, �Ҽ����Ʒ� 10�ڸ�

		String s = "www.codechobo.com";
		System.out.printf("%s%n", s);
		System.out.printf("[%20s]%n", s);
		System.out.printf("[%-20s]%n", s);
		System.out.printf("[%.8s]%n", s);	// 8�ڸ������� ���
	}

}
