package pattern2.command;

/**
 * @author �ź���
 * Strut2,action���������ù��̾�������ģʽ
 * ���ݿ��������Ƶĵײ�ʵ��
 * ����ĳ����ͻָ�
 *
 */
public class Client {
	public static void main(String[] args) {
		Command c = new ConcreteCommand(new Receiver());
		Invoke invoke = new Invoke(c);
		invoke.call();
	}
}
