package com.wutao.springevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class MailSendEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String to;
	
	public MailSendEvent(ApplicationContext source, String to) {
		super(source);
		this.to = to;
	}

	public String getTo() {
		return to;
	}
}
