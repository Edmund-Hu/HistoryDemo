package com.edmund.HelloWorld;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.spring.ActiveMQConnectionFactory;

/**
 * 
 * @author Edmund
 *消息的生成这
 */
public class JMSProducer {
	   //默认连接用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //默认连接地址
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;
    //发送的消息数量
    private static final int SENDNUM = 10;
    
    public static void main(String[] args) {
		ConnectionFactory connectionFactory;//连接工厂
		Connection connection = null; //连接
		Session session; //会话，接收或者发送消息的线程
		Destination destination;//消息发送的目的地
		MessageProducer messageProducer;//消息生产者
		connectionFactory = new org.apache.activemq.ActiveMQConnectionFactory("Edmund", "edmund123456", JMSProducer.BROKEURL);
		  try {
	            //通过连接工厂获取连接
	            connection = connectionFactory.createConnection();
	            //启动连接
	            connection.start();
	            //创建session  参数1是否启动事务，参数2配置接收模式
//	            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
	            //使用客户端签收
	            session = connection.createSession(true, Session.CLIENT_ACKNOWLEDGE);
	            //创建一个名称为HelloWorld的消息队列
	            destination = session.createQueue("HelloWorld");
	            //创建消息生产者
//	            messageProducer = session.createProducer(destination);
	            messageProducer = session.createProducer(null);
	           //设置持久化模式 
	            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
	            //发送消息
	            sendMessage(session, messageProducer,destination);

	            session.commit();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	            if(connection != null){
	                try {
	                    connection.close();
	                } catch (JMSException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	}
    
    /**
     * 发送消息
     * @param session
     * @param messageProducer  消息生产者
     * @throws Exception
     */
    public static void sendMessage(Session session,MessageProducer messageProducer,Destination destination) throws Exception{
        for (int i = 0; i < JMSProducer.SENDNUM; i++) {
            //创建一条文本消息 
            TextMessage message = session.createTextMessage("ActiveMQ 发送消息" +i);
            System.out.println("发送消息：Activemq 发送消息" + i);
            //通过消息生产者发出消息 
//            messageProducer.send(message);
            //第一个参数： 目的地，queue
            //第二个参数：消息体 string
            //第三个参数：是否持久化
            //第四个参数：优先级别0-9，0-4 普通， 5-9 加急， 默认为4
            //第五个参数：消息在MQ上存放的有效期
       
            messageProducer.send(destination, message, DeliveryMode.NON_PERSISTENT, i, 1000*60);
        }

    }
}
