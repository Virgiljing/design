package pattern2.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> list = new ArrayList<>();
	public void registerObserver(Observer obs) {
		list.add(obs);
	}
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}
	/**
	 * ֪ͨ���й۲��߸���״̬
	 */
	public void notifyAllObservers() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
