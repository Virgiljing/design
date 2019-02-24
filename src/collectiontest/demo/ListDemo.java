package collectiontest.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * @author �ź���
 * 
 * Collection
 *     |--List: Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
 *         |--ArrayList:�Ͳ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ٶȿ죬��ɾ�������̲߳�ͬ��
 *         |--LinkedList:�ײ�ʹ�õ��������ݽṹ���ص㣺��ɾ�ٶȺܿ죬��ѯ������
 *         |--Vector:�ײ�ʹ�������ݽṹ���߳�ͬ������ArrayList���
 *     |--Set : Ԫ��������Ԫ�ز������ظ�
 *     
 *     
 *     
 *  List���������еĵ�������ListIterator��Iterator���ӽӿڡ�
 *  �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�ء�
 *  ��Ϊ�ᷢ��ConcurrentModificationException�쳣��
 *  
 *  �����ڵ���ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator�ķ�������
 *  ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
 *  �������ӣ��޸ĵȾ���Ҫʹ�����ӽӿڣ�ListIterator
 *  
 *  �ýӿ�ֻ��ͨ��List���ϵ�listIterator������ȡ
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java01");
		list.add("java02");
		list.add("java03");
		list.add("java04");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//ͨ��indexOf��ȡ�����λ��
		System.out.println(list.indexOf("java02"));
		List<String> subList = list.subList(1, 3);
		System.out.println(subList);
		
		//�ڵ��������У�׼����ӻ�ɾ��Ԫ��
		System.out.println("------------------------");
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			if (string.equals("java02")) {
				//list.add("java008");
				//java.util.ConcurrentModificationException
				iterator2.remove();//java02��list���Ƴ�
				System.out.println(string);
			}
		}
		System.out.println(list);
		
		
		System.out.println("-----------------------------");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			if (string.equals("java03")) {
				//listIterator.add("java009");
				listIterator.set("java100");
			}
		}
		System.out.println(list);
		System.out.println("----------------------");
		System.out.println(listIterator.hasPrevious());//ǰ���Ƿ���Ԫ��
		System.out.println(listIterator.hasNext());//����Ƿ���Ԫ��
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
