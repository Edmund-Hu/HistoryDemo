package com.edmund.quartzTest;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
public class QuartzTest1{
	
		private static Logger log = Logger.getLogger(QuartzTest1.class);
		public void  run() throws SchedulerException{
			log.info("--------------initializing开始初始化------------");
			//首先引入一个调度器scheduler
			SchedulerFactory sf= new StdSchedulerFactory();
			Scheduler scheduler = sf.getScheduler();
			log.info("--------------initialization Complete初始化完成------------");
			 // computer a time that is on the next round minute
			//获得接下来的一个近似的偶数分钟时间
		    Date runTime = evenMinuteDate(new Date());

		    log.info("------- Scheduling Job  -------------------");
		    // define the job and tie it to our HelloJob class
		    //定义一个任务并且将其与HelloJob类绑定
		    JobDetail job = newJob(HelloJob.class).withIdentity("job1", "group1").build();
		    // Trigger the job to run on the next round minute
		    //触发任务在下一分钟调用
		    Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startAt(runTime).build();
		    // Tell quartz to schedule the job using our trigger
		    //让QuartZ使用之前定义的Tringger来调度任务
		    scheduler.scheduleJob(job, trigger);
		    log.info(job.getKey() + " will run at: " + runTime);
		    // Start up the scheduler (nothing can actually run until the
		    // scheduler has been started)
		    
	
		    scheduler.start();

		    log.info("------- Started Scheduler开始调度任务 -----------------");

		    // wait long enough so that the scheduler has an opportunity to
		    // run the job!
		    log.info("------- Waiting 65 seconds... -------------");
		    try {
		        // wait 65 seconds to show job
		       // Thread.sleep(65L * 1000L);
		        // executing...
		      } catch (Exception e) {
		        //
		      }

		      // shut down the scheduler
		     // log.info("------- Shutting Down ---------------------");
		     // scheduler.shutdown(true);
		     // log.info("------- Shutdown Complete -----------------");
		    }
		public static void main(String[] args) throws SchedulerException {
			QuartzTest1 quartzTest1 = new QuartzTest1();
			quartzTest1.run();
		}
	
		
}
