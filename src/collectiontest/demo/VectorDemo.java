package collectiontest.demo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author �ź���
 * ö�پ���Vector���е�ȡ����ʽ��
 * ö�ٺ͵�����һ��
 * ��Ϊö	�����ֹ���
 * ��������ȡ����
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("java01");
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		Enumeration<String> en = v.elements();
		while (en.hasMoreElements()) {
			String string = (String) en.nextElement();
			System.out.println(string);
		}
		
	}
}
