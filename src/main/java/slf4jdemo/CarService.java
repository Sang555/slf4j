package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	private Logger logger=LoggerFactory.getLogger(CarService.class);
	public void process(String message)
	{
		if(logger.isDebugEnabled())
			logger.debug("Processing Car in smartway : {} ",message);
		logger.debug("Processing Car in smartway : {} ",message);
		logger.info("Processing Car:  "+message);
		logger.error("Processing Car in smartway : {} ",message);
		//System.out.println("processed car");
	}

}
