/*
 * 빼기 연산 클래스
 */
public class MinClass {
	private NumClass nc;
	// 생성자 (강제로 숫자 클래스를 넣어서 사용하게끔)
	public MinClass(NumClass nc) {
		this.nc = nc;
	}
	
	// 더하기 연산
	public int calc() {
		return nc.getNum1() - nc.getNum2();
	}
}
