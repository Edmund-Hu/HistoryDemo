package singleton;


public class Singleton {
	private static Singleton instance = null;
	//构造私有构造方法，防止被外部实例化
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		 if (instance == null) {  
//	            instance = new Singleton();  
			    synchronized (instance) {  
	                if (instance == null) {  
	                    instance = new Singleton();  
	                }  
	            }
	        }  
	        return instance;  
	}
	
	   /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }
	
}
