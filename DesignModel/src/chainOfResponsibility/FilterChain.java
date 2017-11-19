package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	private List<Filter> filters = new ArrayList<>();
	
	public void addFilter(Filter filter){
		this.filters.add(filter);
	}

	public String doFilter(String msg) {
		String r = msg;
		for(Filter filter : filters){
			 r=filter.doFilter(r);
		}
		return r;
	}
}
