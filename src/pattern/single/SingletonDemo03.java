package pattern.single;

/**
 * @author �ź���
 *	˫����������
 */
public class SingletonDemo03 {
	//˽�л����캯��
	private SingletonDemo03() {}
	//����˽�о�̬��Ա����
	private static SingletonDemo03 instance;
	//�����ṩ���о�̬�ķ�����ȡ����
	public static SingletonDemo03 getInstance() {
		if (instance==null) {
			synchronized (SingletonDemo03.class) {
				if (instance==null) {
					instance = new SingletonDemo03();
				}
			}
		}
		return instance;
	}
}
