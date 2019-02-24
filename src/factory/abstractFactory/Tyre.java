package factory.abstractFactory;

public interface Tyre {
	void revolve();
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("��תĥ��");
	}
	
}
class LuxuryTyre implements Tyre{
	
	@Override
	public void revolve() {
		System.out.println("��תĥ��");
	}
	
}
