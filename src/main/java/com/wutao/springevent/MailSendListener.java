package com.wutao.springevent;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent> {

	public void onApplicationEvent(MailSendEvent event) {
		// TODO Auto-generated method stub
		MailSendEvent mse = (MailSendEvent) event;
		
		System.out.println("MailSendListener��"+mse.getTo()+"��������һ���ʼ�");
	}

}
