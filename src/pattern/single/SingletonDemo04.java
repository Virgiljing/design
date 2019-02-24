package pattern.single;

/**
 * @author �ź���
 *	��̬�ڲ������
 */
public class SingletonDemo04 {
	//˽�л����캯��
	private SingletonDemo04() {
		
	}
	//������˽�еľ�̬��Ա����
	private static SingletonDemo04 instance;
	//�����ṩ��̬���еķ�����ȥ��������
	public static SingletonDemo04 getInstance() {
		if (instance==null) {
			instance = Sigleton.getSigletonDemo04();
		}
		return instance;
	}
	private static class Sigleton{
		private static final SingletonDemo04 INSTANCE = new SingletonDemo04();
		public static SingletonDemo04 getSigletonDemo04() {
			
			return Sigleton.INSTANCE;
		}
	}
}
