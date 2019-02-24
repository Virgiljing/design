package pattern.proxy.staticproxy;

public class WangPo implements IKindWomen {
	IKindWomen women;
	public WangPo(IKindWomen women) {
		this.women = women;
	}
	public void openHouse() {
		System.out.println("将两人约到已�?好的房间");
	}
	@Override
	public void happyWithMan() {
		openHouse();
		women.happyWithMan();
		clear();
	}
	private void clear() {
		System.out.println("打扫战场。�?��??");
	}
	@Override
	public double collect(double money) {
		System.out.println("王婆收取中介�?"+money*0.3);
		women.collect(money*0.7);
		return money*0.7;
	}
}
