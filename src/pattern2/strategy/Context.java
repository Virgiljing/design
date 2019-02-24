package pattern2.strategy;

/**
 * @author �ź���
 *	����;���Ĳ����ཻ��
 *	�����Ļ��������㷨ֱ�ӺͿͻ��˵ĵ��÷���
 *  spring������ע�룬����ͨ�������ļ�ע��ע��
 */
public class Context {
	private Strategy strategy;//���õ�ǰ�㷨

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void pringPrice(double s) {
		System.out.println("��ı��ۣ�"+strategy.getPrice(s));
	}
}
