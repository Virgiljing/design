package collectiontest.demo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author �ź���
 *  
 *  |Set:Ԫ��������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
 *  	|--HashSet:�ײ����ݽṹ��Hash��
 *  	|--TreeSet:
 *  Set���ϵĹ��ܺ�Collection��һֱ�ġ�
 */
public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		System.out.println(set.add("java01"));
		System.out.println(set.add("java01"));
		set.add("java01");
		set.add("java02");
		set.add("java03");
		set.add("java03");
		set.add("java04");
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
			
		}
	}
}
