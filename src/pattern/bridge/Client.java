package pattern.bridge;

/**
 * @author �ź���
 *   �Ž�ģʽ
 *   -JDBC��������
 *   -AWT�е�Peer�ܹ�
 *   -������־����
 *   -������Դϵͳ�еĽ������
 *   -OAϵͳ�е���Ϣ����
 *
 */
public class Client {
	public static void main(String[] args) {
		Brand levono = new Lenovo();
		Computer2 c = new Laptop2(levono);
		c.sale();
	}
}
