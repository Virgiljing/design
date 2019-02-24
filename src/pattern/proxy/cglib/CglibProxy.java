package pattern.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;



public class CglibProxy implements MethodInterceptor{
	private Object obj;
	public CglibProxy(Object obj) {
		this.obj = obj;
	}
	private void writeLog() {
		System.out.println("鎵撳嵃鏃ュ織----------");
	}
	
	private void chechPrivilege() {
		System.out.println("鏉冮檺妫�鏌�----------");
	}
	public Object createProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(this);
		Object object = enhancer.create();
		return object;
	}
	@Override
	public Object intercept(Object object, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
		if ("save".equals(method.getName())||"update".equals(method.getName())) {
			chechPrivilege();
		}
		Object ob = method.invoke(obj, arg2);
		if ("delete".equals(method.getName())) {
			writeLog();
		}
		return ob;
	}
}
