package pattern.proxy.staticproxy;

public class YangPoxi implements IKindWomen {

	@Override
	public void happyWithMan() {
		System.out.println("é˜Žå©†æƒ? is happyingã€‚ã?‚ã?‚ã??");
	}

	@Override
	public double collect(double money) {
		System.out.println("é˜Žå©†æƒœæ”¶åˆ°äº†"+money);
		return money;
	}

}
