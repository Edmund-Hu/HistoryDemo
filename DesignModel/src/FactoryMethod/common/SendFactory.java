package FactoryMethod.common;
/**
 * 普通工厂方法模式
 * @author Edmund
 *
 */
public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("SMS".equals(type)){
			return new SMSSender();
		}else {
			System.err.println("请输入正确类型");
			return null;
		}
	}
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produce("mail");
		sender.send();
	}
}
