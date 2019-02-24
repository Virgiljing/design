package collectiontest.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author �ź���
 * Arrays:���ڲ�������Ĺ�����
 * asList:��������List����
 */
public class ArraysDemo {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		String[] arr2 = {"aba","cc","gbb"};
		List<String> list = Arrays.asList(arr2);
		//�������ɼ��ϲ�����ʹ����ɾ����
		//��Ϊ����ĳ���ʱ�̶���
		//�����ɾ�ᷢ��UnsupportedOperationException
		//list.add("ss");
		System.out.println("contains:"+list.contains("cc"));
		System.out.println(list);
		int[] nums = {1,2,3};
		Integer[] nums2 = {1,2,3};
		/*
		 * ��������е�Ԫ�ض��Ƕ�����ô��ɼ��ϣ������е�Ԫ�ر��ֱ�Ӽ����е�Ԫ��
		 * ��������е�Ԫ�ض��ǻ����������ͣ���ô����������Ϊ�����е�Ԫ�ش��ڡ�
		 */
		List<int[]> list2 = Arrays.asList(nums);
		List<Integer> list3 = Arrays.asList(nums2);
		System.out.println(list2);
		System.out.println(list3);
	}
}
