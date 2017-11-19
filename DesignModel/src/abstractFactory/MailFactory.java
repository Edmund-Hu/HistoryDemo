package abstractFactory;

public class MailFactory implements AbstractSendFactory {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
