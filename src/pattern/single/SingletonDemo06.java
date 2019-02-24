package pattern.single;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ����ʽ����ģʽ
 * ��ֹ��������л�©��
 */
public class SingletonDemo06 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//˽�л����캯��
	private SingletonDemo06() {
		if (instance != null) {
			throw new RuntimeException("���ܴ������ʵ��");
		}
	}
	//������˽�еľ�̬�ĳ�Ա����
	private static SingletonDemo06 instance;
	//�����ṩһ�����еľ�̬�ķ�����ȡ����
	public static synchronized SingletonDemo06 getInstance() {
		if(instance==null) {		
			instance = new SingletonDemo06();
		}
		return instance;
	}
	
	/**
	 * �����л��ǣ����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�ٴ�������
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
