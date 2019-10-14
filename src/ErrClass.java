
public class ErrClass {
	
	// 오류처리를 해야 된다고 던지는 매소드
	public void method() {
		System.out.println("기본 메소드");
	}
	
	public void errMethod() throws Exception {
		System.out.println("에러 메소드");
	}

}
