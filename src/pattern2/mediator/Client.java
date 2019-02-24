package pattern2.mediator;

/**
 * @author �ź���
 * �н���ģʽ
 * -������ͬ�¶���֮��Ľ�����ϵ��ÿ�����󶼳����н��߶��������
 *  ֻ���н��ߴ򽻵�������ͨ���н��߶���ͳһ������Щ�����ߵĹ�ϵ
 *
 */
public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		Market market = new Market(m);
		Development development = new Development(m);
		Finacial finacial = new Finacial(m);
		market.selfAction();
		market.outAction();
		
	}
}
