package chainOfResponsibility;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		// TODO Auto-generated method stub
		
		return msg.replace("鲁时刻", "时刻");
	}

}
