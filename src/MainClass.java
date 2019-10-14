
public class MainClass {

	public static void main(String[] args) {

		System.out.println("인터페이스를 해보자");
		// 연산을 하는 프로그램
		// 숫자가 필요 
		// 최소 2개 이상
		NumClass num = new NumClass();
		num.setNum1(3);
		num.setNum2(2);
		// 더하기 연산
		AddClass ac = new AddClass(num);
		int num3 = ac.calc();
		System.out.println(num3);
		
		// 빼기 연산
		MinClass mc = new MinClass(num);
		int num4 = mc.calc();
		System.out.println(num4);
		
		//int num3 = num.getNum1() + num.getNum2();
		//System.out.println(num3);
		
		
		int num1 = 3;
		int num2 = 2;
		// 연산자 필요(+, -, *, /)
//		num1 + num2;
		// 계산해서 결과값 보여줌
		int result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		result = num1 / num2;
	}

}
