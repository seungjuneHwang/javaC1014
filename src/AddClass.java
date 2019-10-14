
public class AddClass implements CalInter {
	private NumClass nc;
	// 생성자 (강제로 숫자 클래스를 넣어서 사용하게끔)
	public AddClass(NumClass nc) {
		this.nc = nc;
	}
	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return nc.getNum1() + nc.getNum2();
	}

}
