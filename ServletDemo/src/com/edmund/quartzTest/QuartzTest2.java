package com.edmund.quartzTest;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.DateBuilder;
import org.quartz.DateBuilder.IntervalUnit;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;

import org.quartz.impl.StdSchedulerFactory;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.DateBuilder.futureDate;
import static org.quartz.JobKey.jobKey;

public class QuartzTest2{
	
		private static Logger log = Logger.getLogger(QuartzTest2.class);
		public void  run() throws SchedulerException{
			log.info("--------------initializing开始初始化------------");
			//首先引入一个调度器scheduler
			SchedulerFactory sf= new StdSchedulerFactory();
			Scheduler scheduler = sf.getScheduler();
			log.info("--------------initialization Complete初始化完成------------");
			 // computer a time that is on the next round minute
			//获得15秒偶数倍的时间
		    Date startTime = DateBuilder.nextGivenSecondDate(null, 15);

		    log.info("------- Scheduling Job  -------------------");
		    // define the job and tie it to our HelloJob class
		    //定义一个任务并且将其与SimpleJob类绑定，
		    JobDetail job = newJob(SimpleJob.class).withIdentity("job1", "group1").build();
		    // Trigger the job to run on the next round minute
		    //触发任务在下一分钟调用
		    SimpleTrigger trigger = (SimpleTrigger) newTrigger().withIdentity("trigger1", "group1").startAt(startTime).build();
		    // Tell quartz to schedule the job using our trigger
		    //让QuartZ使用之前定义的Tringger来调度任务
		    Date ft = scheduler.scheduleJob(job, trigger);
		    log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		             + trigger.getRepeatInterval() / 1000 + " seconds");

		    // Start up the scheduler (nothing can actually run until the
		    // scheduler has been started)
		    // 定义调度之后，更改了job的类容，并命名为job2
		    job = newJob(SimpleJob.class).withIdentity("job2", "group1").build();

		    trigger = (SimpleTrigger) newTrigger().withIdentity("trigger2", "group1").startAt(startTime).build();

		    ft = scheduler.scheduleJob(job, trigger);
		    log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		             + trigger.getRepeatInterval() / 1000 + " seconds");

		    // job3 will run 11 times (run once and repeat 10 more times)
		    // job3 will repeat every 10 seconds
		    //job3 将执行11次（立即执行1次，重复执行10次），每个10秒执行一次
		    job = newJob(SimpleJob.class).withIdentity("job3", "group1").build();

		    trigger = newTrigger().withIdentity("trigger3", "group1").startAt(startTime)
		        .withSchedule(simpleSchedule().withIntervalInSeconds(10).withRepeatCount(10)).build();

		    ft = scheduler.scheduleJob(job, trigger);
		    log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		             + trigger.getRepeatInterval() / 1000 + " seconds");
		    // the same job (job3) will be scheduled by a another trigger
		    //相同的job3同时也可以被另外一个触发器Trigger来执行
		    // this time will only repeat twice at a 15 second interval
		    //这次只重复两次（共三次），每个15秒执行一次
		 
		    trigger = newTrigger().withIdentity("trigger3", "group2").startAt(startTime)
		            .withSchedule(simpleSchedule().withIntervalInSeconds(15).withRepeatCount(2)).forJob(job).build();

		        ft = scheduler.scheduleJob(trigger);
		        log.info(job.getKey() + " will [also] run at: " + ft + " and repeat: " + trigger.getRepeatCount()
		                 + " times, every " + trigger.getRepeatInterval() / 1000 + " seconds");
		        // job4 will run 6 times (run once and repeat 5 more times)
		        // job4 will repeat every 10 seconds
		        //job4 将执行6次（立即执行1次，重复执行5次），每个10秒执行一次
		        job = newJob(SimpleJob.class).withIdentity("job4", "group1").build();

		        trigger = newTrigger().withIdentity("trigger4", "group1").startAt(startTime)
		            .withSchedule(simpleSchedule().withIntervalInSeconds(10).withRepeatCount(5)).build();

		        ft = scheduler.scheduleJob(job, trigger);
		        log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		                 + trigger.getRepeatInterval() / 1000 + " seconds");

		        // job5 will run once,  one minutes in the future
		        //job5将在1分钟之后执行一次
		        job = newJob(SimpleJob.class).withIdentity("job5", "group1").build();

		        trigger = (SimpleTrigger) newTrigger().withIdentity("trigger5", "group1")
		            .startAt(futureDate(1, IntervalUnit.MINUTE)).build();

		        ft = scheduler.scheduleJob(job, trigger);
		        log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		                 + trigger.getRepeatInterval() / 1000 + " seconds");

		        // job6 will run indefinitely, every 40 seconds
		        //job6 将一次运行，没40秒执行一次
		        job = newJob(SimpleJob.class).withIdentity("job6", "group1").build();

		        trigger = newTrigger().withIdentity("trigger6", "group1").startAt(startTime)
		            .withSchedule(simpleSchedule().withIntervalInSeconds(40).repeatForever()).build();

		        ft = scheduler.scheduleJob(job, trigger);
		        log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		                + trigger.getRepeatInterval() / 1000 + " seconds");
		       
		        log.info("------- Started Scheduler -----------------");

		        scheduler.start();

		        log.info("------- Started Scheduler开始调度任务 -----------------");

		     
		        // jobs can also be scheduled after start() has been called...
		        // job7 will repeat 20 times, repeat every  minute
		        job = newJob(SimpleJob.class).withIdentity("job7", "group1").build();

		        trigger = newTrigger().withIdentity("trigger7", "group1").startAt(startTime)
		            .withSchedule(simpleSchedule().withIntervalInMinutes(1).withRepeatCount(20)).build();

		        ft = scheduler.scheduleJob(job, trigger);
		        log.info(job.getKey() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every "
		                 + trigger.getRepeatInterval() / 1000 + " seconds");

		        // jobs can be fired directly... (rather than waiting for a trigger)
		        job = newJob(SimpleJob.class).withIdentity("job8", "group1").storeDurably().build();

		        scheduler.addJob(job, true);

		        log.info("'Manually' triggering job8...");
		        scheduler.triggerJob(jobKey("job8", "group1"));
		        log.info("------- Starting Scheduler ----------------");

		        // All of the jobs have been added to the scheduler, but none of the jobs
		        // will run until the scheduler has been started
		  

		 
		    // wait long enough so that the scheduler has an opportunity to
		    // run the job!
		    log.info("------- Waiting 300 seconds... -------------");
		    try {
		        // wait 30 seconds to show job
		        Thread.sleep(300L * 1000L);
		        // executing...
		      } catch (Exception e) {
		        //
		      }

		      // shut down the scheduler
		     log.info("------- Shutting Down ---------------------");
		      scheduler.shutdown(true);
		     log.info("------- Shutdown Complete -----------------");
		    }
		public static void main(String[] args) throws SchedulerException {
			QuartzTest2 quartzTest1 = new QuartzTest2();
			quartzTest1.run();
		}
	
		
}
