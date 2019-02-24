package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author �ź���
 * ��Ԫ����
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> map = new HashMap<>();
	public static ChessFlyWeight getChess(String color) {
		if (map.get(color)!=null) {
			return map.get(color);
		}else {
			ConcreteChess chess = new ConcreteChess(color);
			map.put(color, chess);
			return chess;
		}
	}
}
