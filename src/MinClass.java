/*
 * ���� ���� Ŭ����
 */
public class MinClass {
	private NumClass nc;
	// ������ (������ ���� Ŭ������ �־ ����ϰԲ�)
	public MinClass(NumClass nc) {
		this.nc = nc;
	}
	
	// ���ϱ� ����
	public int calc() {
		return nc.getNum1() - nc.getNum2();
	}
}
