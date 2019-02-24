package pattern.decorator;

/**
 * @author �ź���
 * װ��ģʽ��decorator��
 * ������ʹ�õĳ���
 *   -IO��������������������
 *   -Swing����ͼ�ν��湹������
 *   -Sevlet API���ṩ��request�����Decorator���ģʽ��Ĭ��ʵ����
 *    HttpServletRequestWrapper , HttpServletResponseWrapper��
 *    ��ǿ��request����Ĺ���
 *   -Struts2�У�request��response��session����Ĵ���
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("-----------------");
		WaterCar waterCar = new WaterCar(flyCar);
		waterCar.move();
	}

}
