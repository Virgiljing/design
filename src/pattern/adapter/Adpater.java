package pattern.adapter;

/**
 * @author �ź���
 *  ����������(����������ʽ)
 */
public class Adpater extends Adaptee implements Target{

	@Override
	public void handleReq() {
		super.request();
	}

}
