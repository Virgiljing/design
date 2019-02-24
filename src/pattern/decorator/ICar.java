package pattern.decorator;

public interface ICar {
	void move();
}
class Car implements ICar{
	protected ICar car;
	
	@Override
	public void move() {
		System.out.println("½������");
	}
	
}
class SupperCar implements ICar{
	protected ICar car;
	public SupperCar(ICar car) {
		super();
		this.car = car;
	}
	@Override
	public void move() {
		car.move();
	}
	
}
class FlyCar extends SupperCar{
	
	public FlyCar(ICar car) {
		super(car);
	}
	public void fly() {
		System.out.println("���Ϸɣ�");
	}
	@Override
	public void move() {
		car.move();
		fly();
	}
	
}
class WaterCar extends SupperCar{
	
	public WaterCar(ICar car) {
		super(car);
	}
	public void swim() {
		System.out.println("ˮ���Σ�");
	}
	@Override
	public void move() {
		car.move();
		swim();
	}
	
}
class AICar extends SupperCar{
	
	public AICar(ICar car) {
		super(car);
	}
	public void autoMove() {
		System.out.println("�Լ��ܣ�");
	}
	@Override
	public void move() {
		car.move();
		autoMove();
	}
	
}