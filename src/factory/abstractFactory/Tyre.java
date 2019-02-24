package factory.abstractFactory;

public interface Tyre {
	void revolve();
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("Ðý×ªÄ¥Ëð");
	}
	
}
class LuxuryTyre implements Tyre{
	
	@Override
	public void revolve() {
		System.out.println("Ðý×ªÄ¥Ëð");
	}
	
}
