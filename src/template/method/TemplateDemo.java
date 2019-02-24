package template.method;

/**
 * @author �ź���
 *	ģ�巽�����ģʽ
 *	�ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ���һ�����ǲ�ȷ���ģ�
 *	��ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣�
 *	��ô��ʱ����ȷ���Ĳ��ֱ�¶��ȥ���и��������ȥ��ɡ�
 */
abstract class GetTime{
	public final long getTime() {
		long start = System.currentTimeMillis();
		runcode();
		long end = System.currentTimeMillis();
		return end - start;
	}
	public abstract void runcode();
}

class SubTime extends GetTime{

	@Override
	public void runcode() {
		for (int i = 0; i < 1000; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
}
public class TemplateDemo {
	public static void main(String[] args) {
		SubTime gt = new SubTime();
		long time = gt.getTime();
		System.out.println(time);
	}
}
