package factory.factorymethod;

/**
 * @author �ź���
 * �򵥹���ģʽ
 * �޷����㿪��ԭ��
 *
 */
public class BaoMaFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new BaoMa();
	}
}
