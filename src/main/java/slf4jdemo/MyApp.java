package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
	
	private static Logger logger= LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args)
	{
	
		logger.info("HELLO WORLD");
		int res=add(10,20);
		System.out.println(res);
	}
	public static int add(int a,int b)
	{
		return a+b;
	}

}
