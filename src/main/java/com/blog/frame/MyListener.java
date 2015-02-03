package com.blog.frame;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

/**
 * 
 * @description 
 * @author zacks
 * @date 2015-2-3下午03:26:44
 */
public class MyListener extends ContextLoaderListener {

	private static final Logger logger = LoggerFactory.getLogger(MyListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		
		logger.debug("上下文参数初始化完成=======》");
	}
	
}
