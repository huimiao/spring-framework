package com.huimiao;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.tests.sample.beans.TestBean;

public class Test {
	public static void main(String[] args) {
		XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("/org/springframework/beans/factory/xml/test.xml"));
		System.out.println(((TestBean)xbf.getBean("myalias")).getName());
	}
}
