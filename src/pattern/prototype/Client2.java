package pattern.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author �ź���
 *	����ԭ��ģʽ
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> hobbys = new ArrayList<>();
		hobbys.add("����");
		Sheep2 sheep = new Sheep2("����", new Date(123213213213L),hobbys) ;
		System.out.println(sheep);
		System.out.println(sheep.getSname());
		System.out.println(sheep.getBirthday());
		System.out.println(sheep.getHobbys().size());
		System.out.println("-----------------------------------");
		
		Sheep2 sheep2 = (Sheep2) sheep.clone();
		//���ڶ���ʵ�ֵ������
		sheep.setBirthday(new Date(439812343432L));
		System.out.println("�޸ĺ�����ڶ���"+sheep.getBirthday());
		//�������ʵ�ֵ���ǳ����
		sheep.getHobbys().add("����");
		
		sheep2.setSname("����");
		System.out.println(sheep2);
		
		System.out.println(sheep2.getSname());
		System.out.println(sheep2.getBirthday());
		System.out.println(sheep2.getHobbys().size());
		
	}
}
