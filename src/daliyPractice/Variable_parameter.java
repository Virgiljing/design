package daliyPractice;

/**
 * @author �ź���
 * �ɱ������
 * ��ʵ����һ����������ļ�д��ʽ��
 * ����ÿһ�ζ������������
 * 
 * �ɱ����һ�������ڲ����б�����ߡ�
 */
public class Variable_parameter {
	public static void main(String[] args) {
		show(2,3,4);
	}
	public static void show(int...is) {
		for (int i : is) {
			System.out.println(i);
		}
	}
}
