package daliyPractice;

import java.util.Properties;
import java.util.Set;

/**
 * @author �ź���
 *	system�Ľ���
 */
public class SystemDemo {
	public static void main(String[] args) {
		//��ΪProperties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		Properties properties = System.getProperties();
		//��ϵͳ�������Զ���һЩ��Ϣ
		System.setProperty("myKey", "myValue");
		//����ϵͳ����
		Set<Object> keySet = properties.keySet();
		for (Object object : keySet) {
			String value = (String) properties.get(object);
			System.out.println(object+"::"+value);
		}
		//���ָ��������Ϣ
		String value = System.getProperty("os.name");
		System.out.println("value"+"----"+value);
		
	}
}
