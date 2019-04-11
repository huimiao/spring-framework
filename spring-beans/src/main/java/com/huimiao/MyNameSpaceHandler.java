package com.huimiao;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
