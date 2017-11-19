package chainOfResponsibility;

public class MsgProcessor {
	private String msg;
	//private Filter[] filters= {new HTMLFilter(),new SensitiveFilter()};
	FilterChain fChain;
	
	public FilterChain getfChain() {
		return fChain;
	}


	public void setfChain(FilterChain fChain) {
		this.fChain = fChain;
	}


	public String getMsg() {
		return msg;
	}
	

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String  processor() {
		return fChain.doFilter(msg);
	}
}
