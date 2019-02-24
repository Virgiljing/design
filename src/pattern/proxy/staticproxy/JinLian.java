package pattern.proxy.staticproxy;

public class JinLian implements IKindWomen {

	@Override
	public void happyWithMan() {
		System.out.println("é‡‘èŽ² is happyingã€‚ã?‚ã?‚ã??");
	}

	@Override
	public double collect(double money) {
		System.out.println("é‡‘èŽ²æ”¶åˆ°äº?"+money);
		return money;
	}

}
