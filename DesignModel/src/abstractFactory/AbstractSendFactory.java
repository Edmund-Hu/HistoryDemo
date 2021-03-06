package abstractFactory;
/**
 * 这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，
 * 实现AbstractSendFactory接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 * @author Edmund
 *
 */
public interface AbstractSendFactory {
	public Sender produce();
}
