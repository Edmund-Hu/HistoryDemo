package FactoryMethod.mutiMethod;

import FactoryMethod.common.MailSender;
import FactoryMethod.common.SMSSender;
import FactoryMethod.common.Sender;
/**
 * 
 * @author Edmund
 *多个方法工厂模式
 */
public class SendFactory {
	
	public Sender produceSMS(){
		return new SMSSender();
	}
	public Sender produceMail(){
		return new MailSender();
	}
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produceSMS();
		sender.send();
	}
}
