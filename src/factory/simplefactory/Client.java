package factory.simplefactory;

public class Client {
	public static void main(String[] args) {
		Car car = CarFactory.createCar("±¼³Û");
		Car car2 = CarFactory.createCar("±¦Âí");
		car.run();
		car2.run();
		Car car3 = CarFactory2.createBaoMa();
		Car car4 = CarFactory2.createBenChi();
		car3.run();
		car4.run();
	}
}
