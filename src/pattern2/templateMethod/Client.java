package pattern2.templateMethod;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要存钱！！！");
			}
		};
		btm2.process();
		BankTemplateMethod btm3 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要理财！！！，手里有两千万韩元");
			}
		};
		btm3.process();
	}
}
class DrawMoney extends BankTemplateMethod{
	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
}