
public class AddClass implements CalInter {
	private NumClass nc;
	// ������ (������ ���� Ŭ������ �־ ����ϰԲ�)
	public AddClass(NumClass nc) {
		this.nc = nc;
	}
	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return nc.getNum1() + nc.getNum2();
	}

}
