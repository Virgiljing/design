package pattern.facade;

/**
 * @author �ź���
 * ����ע�ṫ˾���̵��������
 */
public class RegisterFacade {
	public void register() {
		���̾� a = new ���������̾�();
		a.checkName();
		�ʼ�� b = new �����ʼ��();
		b.orgCodeCertificate();
		˰��� c = new ����˰���();
		c.taxCertificate();
		���� d = new �й���������();
		d.openAccount();
	}
}
