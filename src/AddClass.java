
public class AddClass {
	private NumClass nc;
	// ������ (������ ���� Ŭ������ �־ ����ϰԲ�)
	public AddClass(NumClass nc) {
		this.nc = nc;
	}
	
	// ���ϱ� ����
	public int calc() {
		return nc.getNum1() + nc.getNum2();
	}
}
