package com.wutao.springevent;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailSender implements ApplicationContextAware {
	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx = applicationContext;
	}
	
	public void sendMail(String to){
		System.out.println("Ä£Äâ·¢ËÍÓÊ¼þ¡£¡£¡£");
		
		MailSendEvent mse = new MailSendEvent(ctx, to);
		
		ctx.publishEvent(mse);
	}

}
