package pattern.flyweight;

/**
 * @author �ź���
 * ��Ԫģʽ
 *   -��������ڴ��ж��������
 *   -
 *
 */
public class Client {

	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("��ɫ");
		System.out.println(chess1);
		System.out.println(chess2);
		System.out.println("�����ⲿ״̬����=======");
		chess1.display(new Coordinate(5,6));
		chess2.display(new Coordinate(88,60));
	}

}
