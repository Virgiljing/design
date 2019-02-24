package generic;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @author �ź���
 *	���ͣ�JDK1.5�汾�Ժ���ֵ������ԡ����ڽ����ȫ���⣬��һ����ȫ���ơ�
 *	�ô�
 *  1.������ʱ�ڳ��ֵ�����ClassCastException��ת�Ƶ�����ʱ�ڡ�
 *      �����ڳ���Ա������⡣����������������٣���ȫ��
 *  2.������ǿ������ת�����鷳
 *  
 *  
 */
public class GenericDemo {
	public static void main(String[] args) {
		Tool<Worker> t = new Tool<>();
		Worker e = t.getE();
		System.out.println(e);
		
		System.out.println("----------------");
		
		Demo<String> d = new Demo<>();
		d.show("aaaa");
		d.print("bbbb");
		
		Demo1 d1 = new Demo1();
		d1.show("haha");
		d1.print(4);
		
		System.out.println("-------------------");
		Demo2<String> d2 = new Demo2<>();
		d2.show("ssss");
		d2.print("aa");
		d2.print(3);
		
	}
}

class Worker{}


/**
 * @author �ź���
 *
 * @param <QQ>
 * �����ࡣ
 * �Ų�����Ӧ���������Ͳ�ȷ����ʱ��
 * ���ڶ���Object�������չ
 * ���ڶ��巺�����������չ
 * 
 */
class Tool<QQ>{
	private QQ qq;

	public QQ getE() {
		return qq;
	}

	public void setE(QQ qq) {
		this.qq = qq;
	}
	
}

/**
 * @author �ź���
 *
 * @param <T>
 * 
 * �����ඨ��ķ��ͣ�������������Ч�����������ʹ�ã�
 * ��ô������Ķ�����ȷ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶���
 * 
 * Ϊ���ò�ͬ����������ͬ���ͣ��������ͻ���ȷ����
 * ���Խ����Ͷ����ڷ����ϡ�
 */
class Demo<T>{
	public void show(T t) {
		System.out.println("show:"+t);
	}
	public void print(T t) {
		System.out.println("print:"+t);
	}
}
class Demo1{
	public <T> void show(T t) {
		System.out.println("show:"+t);
	}
	public <Q> void print(Q q) {
		System.out.println("print:"+q);
	}
}
class Demo2<T>{
	public void show(T t) {
		System.out.println("show:"+t);
	}
	public <Q> void print(Q q) {
		System.out.println("print:"+q);
	}
}

/**
 * ����֮����
 * ��̬���������Է������ϵķ���
 */

class Demo3<T>{
	public void show(T t) {
		System.out.println("show:"+t);
	}
	public <Q> void print(Q q) {
		System.out.println("print:"+q);
	}
	public static <M> void run(M m) {
		System.out.println("run:"+m);
	}
}

/**
 * @author �ź���
 *
 * @param <T>
 * 
 * ���Ͷ��嵽�ӿ���
 */
interface Inter<T>{
	void show(T t);
}
class InterImpl implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println("show:"+t);
	}
	
}
class InterImpl1<T> implements Inter<T>{

	@Override
	public void show(T t) {
		System.out.println("show:"+t);
	}
	//���������������
	//�������෺������
	//����  -->�̳У�ʵ�ֲ�ָ�����ͣ�ʹ��ʱ��ָ������
	//������ڵ��ڸ���
	//����û�ж�̬
	
	
}