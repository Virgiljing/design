package factory.factorymethod;

/**
 * @author �ź���
 * ��������ģʽ
 *
 */
public class BenChiFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new BenChi();
	}
}
