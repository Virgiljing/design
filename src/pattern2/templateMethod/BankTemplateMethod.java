package pattern2.templateMethod;

/**
 * @author �ź���
 *  ģ�巽��
 */
public abstract class BankTemplateMethod {
	public void takeNumber() {
		System.out.println("�Ŷ�ȡ��");
	}
	public abstract void transact();
	public void evaluate() {
		System.out.println("��������");
	}
	public final void process() {//ģ�巽��
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
