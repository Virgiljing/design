package factory.abstractFactory;

public interface Seat {
	void massage();
}
class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("��ͨ����");
	}
}
class LuxurySeat implements Seat{
	
	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ");
	}
}
