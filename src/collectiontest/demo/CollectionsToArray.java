package collectiontest.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsToArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");
		/*
		 * ָ�����͵����鳤��С�ڼ��ϵ�size����ô�÷����ڲ��ᴴ��һ���µ����飬����Ϊ���ϵ�size
		 * ��ָ����������ĳ��Ĵ��ڼ��ϵ�size���Ͳ��ᴴ�������飬����ʹ�ô��ݽ���������
		 * 
		 * ���ϱ�����Ϊ���޶���Ԫ�صĲ���
		 */
		String[] arr = al.toArray(new String[5]);
		System.out.println(Arrays.asList(arr));
		
	}
}
