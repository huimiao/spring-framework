package com.huimiao.lookup;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("/org/springframework/beans/factory/xml/huimiaotest.xml"));

		//factory.
		((User2)factory.getBean("user2")).test();
		((User2)factory.getBean("user2")).test();

	}

}
