package kr.co.softsoldesk.model;

import javax.servlet.http.HttpServletRequest;

public class Test2Service {

	public static int minus(HttpServletRequest request) {
		
		String str1 = (String)request.getParameter("data1");
		String str2 = (String)request.getParameter("data2");
		
		int t1 = Integer.parseInt(str1);
		int t2 = Integer.parseInt(str2);
		
		int result=t1+t2;
		
		return result;
		
	}
}
