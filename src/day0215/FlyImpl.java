package day0215;

/**
 * Fly interface�� ������ Ŭ���� �ۼ�. FlyImpl�� Fly�̴�.(is a����,��ü������)
 * @author user
 */
public class FlyImpl implements Fly {

	@Override
	public String upwardForce() {
		return "���";
	}//upwardForce

	@Override
	public String drivingForce() {
		return "������";
	}//drivingForce

}
