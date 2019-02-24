package collectiontest.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author �ź���
 * Map���ϵ�����ȥ����ʽ��
 *    1.  Set<K> keySet():��map�����еļ����뵽Set�����С�Set���е�������
 *        ���п��Ե�����ʽȡ���ļ����ڸ���get��������ȡÿһ������Ӧ��ֵ��
 *        Map���ϵ�ȡ��ԭ����Map����ת��Set����
 *        
 *    2.  Set<entrySet():
 *        ��Map�����е�ӳ���ϵ���뵽��set�����У��������ϵ���������;���:Map.Entry
 *      
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		map.put("01", "lisi1");
		map.put("02", "lisi2");
		map.put("03", "lisi3");
		map.put("04", "lisi4");
		map.put("05", "lisi5");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key+"::::"+value);
		}
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
	}
}
