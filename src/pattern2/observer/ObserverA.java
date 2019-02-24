package pattern2.observer;

public class ObserverA implements Observer {
	private int myState;    //myStateҪ��Ŀ������stateֵ����һ��
	
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}
	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
	}
	
}
