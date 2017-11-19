package abstractFactory;

public class SMSFactory implements AbstractSendFactory {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		
		return new SMSSender();
	}

}
