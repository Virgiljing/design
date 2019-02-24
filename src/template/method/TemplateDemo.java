package template.method;

/**
 * @author 张航铭
 *	模板方法设计模式
 *	在定义功能时，功能的一部分是确定的，有一部分是不确定的，
 *	而确定的部分在使用不确定的部分，
 *	那么这时将不确定的部分暴露出去，有该类的子类去完成。
 */
abstract class GetTime{
	public final long getTime() {
		long start = System.currentTimeMillis();
		runcode();
		long end = System.currentTimeMillis();
		return end - start;
	}
	public abstract void runcode();
}

class SubTime extends GetTime{

	@Override
	public void runcode() {
		for (int i = 0; i < 1000; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
}
public class TemplateDemo {
	public static void main(String[] args) {
		SubTime gt = new SubTime();
		long time = gt.getTime();
		System.out.println(time);
	}
}
