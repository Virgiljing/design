package pattern2.memento;

public class Client {

	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("����", 29, 90000);
		System.out.println("��һ�δ�������"+emp.getEname()+"-----"+emp.getAge()+"-----"+emp.getSalary());
		taker.setMemento(emp.memento());//����һ��
		emp.setAge(88);
		emp.setEname("����");
		emp.setSalary(8000);
		System.out.println("�ڶ��δ�������"+emp.getEname()+"-----"+emp.getAge()+"-----"+emp.getSalary());
		emp.recovery(taker.getMemento());//�ָ�������¼���󱣴��״̬
		System.out.println("�����δ�������"+emp.getEname()+"-----"+emp.getAge()+"-----"+emp.getSalary());
	}

}
