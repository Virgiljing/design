package collectiontest.demo;

import java.util.LinkedList;

import org.junit.Test;

/**
 * @author �ź���
 * LinkedList:���з�����
 * addFirst();
 * addLast();
 * 
 * ��ȡԪ��
 * ���������û��Ԫ�ؾͻ����NoSuchElementException 
 * getFirst();
 * getLast();
 * 
 * ��ȡԪ�ز�ɾ��
 * ���������û��Ԫ�ؾͻ����NoSuchElementException 
 * removeFirst();
 * removeLast();
 * 
 * ��JDK1.6�����������
 * 
 * offerFirst();
 * offerLast();
 * 
 * ��ȡԪ�ص���ɾ��Ԫ�ء����������û��Ԫ�ػ᷵��null
 * peekFirst();
 * peekLast();
 * 
 * 
 * ��ȡԪ�ز�ɾ��Ԫ�ء����������û��Ԫ�ػ᷵��null
 * pollFirst();
 * pollLast();
 * 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Object> link = new LinkedList<>();
		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");
		System.out.println(link);
		System.out.println(link.getFirst());
		System.out.println(link.size());
		System.out.println(link.removeLast());
		System.out.println(link.size());
		
		while (!link.isEmpty()) {
			System.out.println(link.removeFirst());
		}
	}
	/**
	 * ʹ��LinkedList ģ��һ����ջ���߶������ݽṹ��
	 * 
	 * ��ջ���Ƚ����
	 * ���У��Ƚ��ȳ�
	 */
	@Test
	public void test() {
		
	}
}
