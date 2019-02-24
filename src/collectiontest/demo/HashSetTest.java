package collectiontest.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author �ź���
 *  
 *  |Set:Ԫ��������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
 *  	|--HashSet:�ײ����ݽṹ��Hash��
 *  	         ��ͨ��Ԫ�ص�����������hashCode��equals����ɡ�
 *  	         ���Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
 *         ���Ԫ�ص�hashCodeֵ��ͬ���������equals��       
 *         
 *         ע�⣬�����ж�Ԫ���Ƿ���ڣ�һ��ɾ���Ȳ����������ķ�����Ԫ�ص�hashCode��equals������
 *  	|--TreeSet:
 *  Set���ϵĹ��ܺ�Collection��һֱ�ġ�
 */
public class HashSetTest{
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("lisi", 18));
		set.add(new Student("lisi", 18));
		set.add(new Student("zhangsan", 23));
		set.add(new Student("wangwu", 10));
		set.add(new Student("zhaoliu", 35));
		
		System.out.println(set.contains(new Student("zhangsan", 23)));
		
		System.out.println(set.remove(new Student("zhaoliu",35)));
		
		System.out.println("---------------------");
		for (Iterator<Student> iterator = set.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}
}

class Student{
	private String name;
	private int age;
	@Override
	public int hashCode() {
		System.out.println(this.name+"����������������hashCode");
		return name.hashCode()+age*39;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student person = (Student)obj;
		System.out.println(this.name+"-----"+person.name);
		return this.name.equals(person.name)&&this.age==person.age;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
}