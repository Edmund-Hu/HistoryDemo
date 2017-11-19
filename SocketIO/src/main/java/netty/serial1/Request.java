package netty.serial1;

import java.io.Serializable;

public class Request implements Serializable{

	private static final long  SerialVersionUID = 1L;
	
	private String id ;
	private String name ;
	private byte[] requestMessage ;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getRequestMessage() {
		return requestMessage;
	}
	public void setRequestMessage( byte[] requestMessage) {
		this.requestMessage = requestMessage;
	}


}
