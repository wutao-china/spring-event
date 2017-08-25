package com.wutao.springevent;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailSendTest {
	@Test
	public void testSendEmail(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/spring-application.xml");
		
		MailSender sender = (MailSender)ctx.getBean("mailSender");
		
		sender.sendMail("823222759@qq.com");
	}
}
