package pattern.adapter;

/**
 * @author �ź���
 *  ����������(������ϵķ�ʽ)
 */
public class Adpater2 implements Target{
    private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adpater2(Adaptee adaptee) {
		
		this.adaptee = adaptee;
	}

}
