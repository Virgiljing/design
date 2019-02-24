package pattern.compsite;
//���ģʽ
/**
 * �������
 */
public interface Component {
	void operation();
}

/**
 * Ҷ�����
 */
interface Leaf extends Component{
	
}
/**
 *	����������ɫ
 */
interface Composite extends Component{
	void add (Component c);
	void remove(Component c);
	Component getChild(int index);
}