package com.jak.simplelogic;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleLogic implements InitializingBean{
	public SimpleLogic() {
		System.out.println("Class was created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Class was intialized");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("Class was initilized in after Property set");
	}
	
	@PreDestroy
	public void destroyed() {
		System.out.println("Bean is about to get destroyed ");
	}
	
}
