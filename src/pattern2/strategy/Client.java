package pattern2.strategy;

/**
 * @author �ź���
 * ��������
 * -JAVASE�е�GUI��̣����ֹ���
 * -Spring����У�Resource�ӿڣ���Դ���ʲ���
 * -javax.servlet.http.HttpServlet#service()
 *
 */
public class Client {
	public static void main(String[] args) {
		Strategy s1 = new OldCustomerFewStrategy();
		Context context = new Context(s1);
		context.pringPrice(100);
	}
}
