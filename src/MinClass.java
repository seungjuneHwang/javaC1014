/*
 * ���� ���� Ŭ����
 */
public class MinClass implements CalInter {
	private NumClass nc;
	// ������ (������ ���� Ŭ������ �־ ����ϰԲ�)
	public MinClass(NumClass nc) {
		this.nc = nc;
	}
	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return nc.getNum1() - nc.getNum2();
	}
	
}
