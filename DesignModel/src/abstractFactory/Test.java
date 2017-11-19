package abstractFactory;

public class Test {
	public static void main(String[] args) {
		AbstractSendFactory factory = new SMSFactory();
		Sender sender = factory.produce();
		sender.send();
	}
}
