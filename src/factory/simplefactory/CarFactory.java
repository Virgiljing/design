package factory.simplefactory;

/**
 * @author �ź���
 * �򵥹���ģʽ
 * �޷����㿪��ԭ��
 *
 */
public class CarFactory {
	public static Car createCar(String type) {
		if ("����".equals(type)) {
			return new BenChi();
		}else if ("����".equals(type)) {
			return new BaoMa();
		}else {
			return null;
		}
	}
}
