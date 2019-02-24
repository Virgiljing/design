package factory.abstractFactory;

public interface Engine {
	void run();
	void start();
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�ܵ���");
	}

	@Override
	public void start() {
		System.out.println("������");
	}
	
}
class LuxuryEngine implements Engine{
	
	@Override
	public void run() {
		System.out.println("�ܵĿ�");
	}
	
	@Override
	public void start() {
		System.out.println("������");
	}
	
}
