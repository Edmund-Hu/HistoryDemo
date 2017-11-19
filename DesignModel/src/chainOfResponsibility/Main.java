package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		String msg = "wang <script>鲁时刻记得快放假啊大空间框架";
		MsgProcessor ms = new MsgProcessor();
		ms.setMsg(msg);
		FilterChain fChain = new FilterChain();
		fChain.addFilter(new HTMLFilter());
		FilterChain fChain2 = new FilterChain();
		fChain2.addFilter(new SensitiveFilter());
		fChain.addFilter(fChain2);
		ms.setfChain(fChain);
		String result = ms.processor();
		System.out.println(result);
	}

}
