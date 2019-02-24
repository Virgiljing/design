package pattern.bridge;

/**
 * �������͵�ά��
 * @author �ź���
 *
 */
public class Computer2 {
	protected Brand brand;

	public Computer2(Brand brand) {
		super();
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}
class Laptop2 extends Computer2{

	public Laptop2(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("���۱ʼǱ�");
	}
	
}
class Desktop2 extends Computer2{
	
	public Desktop2(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("����̨ʽ��");
	}
	
}
class Pad2 extends Computer2{
	
	public Pad2(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("����ƽ�����");
	}
	
}