package pattern2.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
	private EmpMemento memento;
	
	//���Խ��ж�α���
	private List<EmpMemento> list = new ArrayList<>();
	//ջ�Ƚ��ȳ����б���¼����
	private Stack<EmpMemento> stack = new Stack<>();
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
}
