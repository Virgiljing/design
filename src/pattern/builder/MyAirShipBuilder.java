package pattern.builder;

public class MyAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("����������");
		return new Engine("������");//���Ժ͹���ģʽ����ģʽ���
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("���������");
		return new OrbitalModule("�����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("������");
	}

}
