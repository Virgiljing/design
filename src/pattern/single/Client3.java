package pattern.single;

import java.util.concurrent.CountDownLatch;

/**
 * @author �ź���
 * ���Զ��̻߳��������ִ�������ģʽ��Ч��
 *
 */
public class Client3 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		int num = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(num);
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 100000; j++) {
						Object instance = SingletonDemo04.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();//main�߳����� ��֪����������Ϊ0���Ż����������
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ:"+(end-start));
	}
}
