package pattern.single;

/**
 * ����ʽ����ģʽ
 * ȱ�㣺ʵ���������ǰ���س���
 * �е㣺�̰߳�ȫ���ڶ��̲߳������ʵ�����²��ᴴ���������
 */
public class SingletonDemo01 {
	//����һ����̬�ĳ�Ա����������ʼ��
	private static SingletonDemo01 instance = new SingletonDemo01();
	//˽�л����캯��
	private SingletonDemo01() {}
	//�ṩһ�����еľ�̬�ķ�����ȡ�������
	public static SingletonDemo01 getInstance() {
		return instance;
	}
	
}
