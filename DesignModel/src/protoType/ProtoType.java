package protoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProtoType implements Cloneable,Serializable {
	 private static final long serialVersionUID = 1L;  
	 private String string;
	 private SerializableObject obj;
	 
	 public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	//浅复制
	public Object clone() throws CloneNotSupportedException {  
		 ProtoType proto = (ProtoType) super.clone();  
	        return proto;  
	    }  
	
	 /* 深复制 */  
    public Object deepClone() throws IOException, ClassNotFoundException {  
  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    } 
    
    //第二种深复制的方法，属性为应用对象的，该引用对象需要重写clone方法。
    public Object deepClone2() throws CloneNotSupportedException{
    	 ProtoType proto = (ProtoType) super.clone();  
    	 proto.setObj((SerializableObject) (this.getObj().clone()));
	        return proto;  
    	
    }
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
    	ProtoType protoType = new ProtoType();
    	protoType.setObj(new SerializableObject());
    	ProtoType protoType2 = (ProtoType) protoType.clone();
    	//浅复制，引用对象是同一个对象
    	System.out.println(protoType.getObj().equals(protoType2.getObj()));
    	ProtoType protoType3 = (ProtoType) protoType.deepClone2();
    	//深复制，所有的属性都是新的，引用对象不同
    	System.out.println(Objects.equals(protoType.getObj(), protoType3.getObj()));
    	
    	List<String> a = new ArrayList<String>();
    	a.add("1");
    	a.add("2");
    	a.add("3");
    	for (String temp : a) {
    	if ("2".equals(temp)) {
    	    a.remove(temp);
    	}
    	}
    	System.out.println(a.size());
	}
}
