
public class MainClass {

	public static void main(String[] args) {

		System.out.println("�������̽��� �غ���");
		// ������ �ϴ� ���α׷�
		// ���ڰ� �ʿ� 
		// �ּ� 2�� �̻�
		NumClass num = new NumClass();
		num.setNum1(3);
		num.setNum2(2);
		// ���ϱ� ����
		CalInter ac = new AddClass(num);
		int num3 = ac.calc();
		System.out.println(num3);
		
		// ���� ����
		ac = new MinClass(num);
		int num4 = ac.calc();
		System.out.println(num4);
		
		//int num3 = num.getNum1() + num.getNum2();
		//System.out.println(num3);
		
		
		int num1 = 3;
		int num2 = 2;
		// ������ �ʿ�(+, -, *, /)
//		num1 + num2;
		// ����ؼ� ����� ������
		int result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		
		
		// �����⿡�� 0�̸� 
		// ������ ���µ� �̰Ÿ� ó��
		try {
			num2 = 0;
			result = num1 / num2;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace(); // ������ �̷��� ��!!
			// ���� ���� �޼��� ó��
			System.out.println(e.getMessage());
			System.out.println("0���� ������ �ȵ˴ϴ�!!");
		}
		
		// ���� Ŭ���� �θ���
		ErrClass ec = new ErrClass();
		ec.method();
		try {
			ec.errMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
