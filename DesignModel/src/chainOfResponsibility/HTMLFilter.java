package chainOfResponsibility;

public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		// TODO Auto-generated method stub
		return msg.replace("<", "[").replace(">", "]");
	}

}
