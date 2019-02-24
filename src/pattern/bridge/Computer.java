package pattern.bridge;

public interface Computer {
	void sale();
}

class Laptop implements Computer{

	@Override
	public void sale() {
		System.out.println("���۱ʼǱ�");
	}
	
}
class Desktop implements Computer{
	
	@Override
	public void sale() {
		System.out.println("����̨ʽ��");
	}
	
}
class Pad implements Computer{
	
	@Override
	public void sale() {
		System.out.println("����ƽ�����");
	}
	
}
class ShenZhouLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("�������ݱʼǱ�");
	}
}
class ShenZhouDesktop extends Laptop{
	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}
class ShenZhouLapPad extends Laptop{
	@Override
	public void sale() {
		System.out.println("��������ƽ��");
	}
}
class DellLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("����Dell�ʼǱ�");
	}
}
class DellDesktop extends Laptop{
	@Override
	public void sale() {
		System.out.println("����Dell̨ʽ��");
	}
}
class DellLapPad extends Laptop{
	@Override
	public void sale() {
		System.out.println("����Dellƽ��");
	}
}
