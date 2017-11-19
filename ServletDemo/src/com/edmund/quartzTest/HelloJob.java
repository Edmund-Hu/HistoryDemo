package com.edmund.quartzTest;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
	private static Logger _log = Logger.getLogger(HelloJob.class);
	public HelloJob() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		  // Say Hello to the World and display the date/time
        _log.info("Hello World! - " + new Date());
	}

}
