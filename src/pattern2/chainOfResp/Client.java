package pattern2.chainOfResp;

/**
 * @author �ź���
 * ������
 * Java���쳣����
 * JavaScript�¼���ð�ݺͲ���Java���¼��Ĵ�����õ��ǹܲ���ģʽ
 * Servlet�����У�����������ʽ����
 * Struts2�У��������ĵ���Ҳ�ǵ��͵�������ģʽ
 *
 */
public class Client {
	public static void main(String[] args) {
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader c = new GeneralManager("����");
		a.setNextLeader(b);
		b.setNextLeader(c);
		LeaveRequest request = new LeaveRequest("����", 20, "��Ӣ���ϼ�̽��");
		a.handlerRequest(request);
	}
}
