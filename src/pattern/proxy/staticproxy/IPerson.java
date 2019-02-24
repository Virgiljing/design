package pattern.proxy.staticproxy;

public interface IPerson {
	void eat();
	void run();
	void study();
}

class Man implements IPerson {

	@Override
	public void eat() {
		System.out.println("男人大口吃肉！！！！");
	}

	@Override
	public void run() {
		System.out.println("男人快步走！！！");
	}

	@Override
	public void study() {
		System.out.println("是男人就学Java！！�?");
	}}