package protoType;

import java.io.Serializable;

public class SerializableObject implements Serializable,Cloneable {
	 private static final long serialVersionUID = 1L; 	public Object clone() throws CloneNotSupportedException {  
		 SerializableObject ser = (SerializableObject) super.clone();  
	        return ser;  
	    }
	 
}
