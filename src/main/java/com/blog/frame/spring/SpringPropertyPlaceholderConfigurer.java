package com.blog.frame.spring;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.blog.util.PropertiesUtils;

/**
 * Spring初始化时，读取配置文件，
 * 设置Properties
 */
public class SpringPropertyPlaceholderConfigurer  extends PropertyPlaceholderConfigurer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringPropertyPlaceholderConfigurer.class);
	
	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		//往文件配置类，添加属性
		PropertiesUtils.setProps(props);
		
		LOGGER.info("读取配置文件完成！");
	}
}
