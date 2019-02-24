package pattern.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object object;
	public MyInvocationHandler(Object object) {
		super();
		this.object = object;
	}
	private void openHouse() {
		System.out.println("将两人约到已�?好的房间。�?��?��?��??");
	}
	private void clear() {
		System.out.println("打扫战场�?");
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String name = method.getName();
		if (name.equals("happyWithMan")) {
			openHouse();
			method.invoke(object, args);
			clear();
			return null;
		}else if(name.equals("collect")) {
			double money = (double)args[0];
			System.out.println("平台收取"+money*0.3+"中介�?");
			method.invoke(object, money*0.7);
			return money;
		}else if(name.equals("run")) {
			System.out.println("和你�?起肩并肩飞上天！�?");
			return null;
		}else {
			return method.invoke(object, args);
		}
	}

}
