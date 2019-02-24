package pattern2.mediator;

public class Market implements Department {
	private Mediator m;
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("�����г�����ȥ����Ŀ");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨��������Ŀ�нӵĽ��ȣ���Ҫ�ʽ�");
		m.command("finacial");
	}
	
}
