package pattern.single;

/**
 * ����ʽ����ģʽ
 *	�е㣺���������ʵ������
 *	ȱ�㣺�̲߳���ȫ���������Խ��
 *	����ϵͳ������Դ
 */
public class SingletonDemo02 {
	//˽�л����캯��
	private SingletonDemo02() {}
	//������˽�еľ�̬�ĳ�Ա����
	private static SingletonDemo02 instance;
	//�����ṩһ�����еľ�̬�ķ�����ȡ����
	public static synchronized SingletonDemo02 getInstance() {
		if(instance==null) {		
			instance = new SingletonDemo02();
		}
		return instance;
	}
}
