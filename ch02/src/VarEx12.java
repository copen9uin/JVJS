
public class VarEx12 {

	public static void main(String[] args) {
		//Ÿ�� ���� ��ȯ
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	//���ڿ� ->����->����
		System.out.println('3' - '0' + 1); //���� ->����
		System.out.println(Integer.parseInt(str) + 1); //���ڿ�->����(int)
		System.out.println("3" + 1); //���ڿ� + ���� = ���ڿ� "31"
		System.out.println(3 + '0'); //0�� ���ڷ� 48�̿��� 3+48=51
		System.out.println((char)(3 + '0')); //����ȯ�� �ؾ� ����->����
		

	}

}
