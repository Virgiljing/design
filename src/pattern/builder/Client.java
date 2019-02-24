package pattern.builder;

/**
 * @author �ź���
 *	������ģʽ
 */
public class Client {
	public static void main(String[] args) {
		AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
		AirShip ship = director.directAirShip();
		ship.launch();
	}
}
