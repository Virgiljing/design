package pattern2.command;

public class Invoke {
	private Command command;//Ҳ����ͨ������List<Command> ���ɺܶ�����������������ݿ�ײ���������������ƵĽṹ
	public Invoke(Command command) {
		super();
		this.command = command;
	}
	/**
	 * ��������ִ��ǰ��ִ�к�������Ӧ����
	 */
	public void call() {
		command.execute();
	}
}
