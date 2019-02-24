package pattern2.observer2;

/**
 * @author �ź���
 *	�۲���ģʽ
 *   -�����ҳ��򣬷�����ת�������пͻ���
 *   -������Ϸ�����������ͻ��˵�״̬���зַ�
 *   -�ʼ�����
 *   -Servlet�У���������ʵ��
 *   -Android�У��Ĺ㲥����
 *   -JDK��AWT��ʱ�䴦��ģ��
 *   -�����̳�
 */
public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		subject.set(3000);
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		subject.set(900);
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
