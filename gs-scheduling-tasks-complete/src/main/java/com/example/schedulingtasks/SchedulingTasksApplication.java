package com.example.schedulingtasks;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication includes 3 parts:
//@EnableAutoConfiguration//1.
@Configuration//2.
@ComponentScan//3.
@EnableScheduling //support scheduling
public class SchedulingTasksApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SchedulingTasksApplication.class);
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SchedulingTasksApplication.class);
        //ScheduledTasks scheduledTasks = context.getBean(ScheduledTasks.class);//1 method 		
	}
	
    @Bean
    ScheduledTasks scheduledTasks() {//2 method
        return new ScheduledTasks();
    }
}
