package collectiontest.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author �ź���
 *	Map���ϣ��ü��ϴ洢��ֵ�ԡ�Ҫ��֤����Ψһ��
 *  1.���
 *      put(K key,V value)
 *      putAll(Map<? extends K,? extends V> m)
 *  2.ɾ��
 *      clear();
 *      remove(Object key)
 *  3.�ж�
 *      containsValue(Object value)
 *      containsKey(Object key)
 *      isEmpty()
 *      
 *  4.��ȡ
 *      get(Object key)
 *      size()
 *      values()
 *      
 *      entrySet()
 *      keySet()
 *      
 * Map
 *     |--Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ġ�jdk1.0Ч�ʵ�
 *     |--HashMap:�ײ��ǹ�ϣ�����ݽṹ������ʹ��null��nullֵ���ü����ǲ�ͬ���ġ�jdk1.2Ч�ʸ�
 *     |--TreeMap:�ײ��Ƕ��������ݽṹ���̲߳�ͬ�����������ڸ�Map�����еļ���������
 * ��Set����
 * Set�ײ����ʹ��Map���ϡ�
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		//���Ԫ�أ�����������ʱ����ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ�м���Ӧ��ֵ����put()�������ر����ǵ�ֵ
		System.out.println(map.put("01", "zhangsan1"));
		System.out.println(map.put("01", "lisi"));
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		System.out.println("containsKey:"+map.containsKey("01"));
		System.out.println("remove:"+map.remove("02"));
		System.out.println("get:"+map.get("03"));
		map.put(null, "zhang");
		System.out.println(map);
		System.out.println("-------------");
		//��ȡMap�����е����е�ֵ��
		Collection<String> values = map.values();
		System.out.println(values);
	}
}
