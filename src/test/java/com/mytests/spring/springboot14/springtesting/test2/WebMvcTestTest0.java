package com.mytests.spring.springboot14.springtesting.test2;

import com.mytests.spring.springboot14.springtesting.test2.components.Comp1;
import com.mytests.spring.springboot14.springtesting.test2.components.Service1;
import com.mytests.spring.springboot14.springtesting.test2.controllers.Controller1;
import com.mytests.spring.springboot14.springtesting.test2.controllers.ControllerAdvice1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

@RunWith(SpringRunner.class)
@WebMvcTest
public class WebMvcTestTest0 {

	@Autowired
	WebMvcConfigurer webMvcConfigurer;

	@Autowired
	private Controller1 controller1; // @Controller

	@Autowired
	private ControllerAdvice1 advice1; // @ControllerAdvice

	@Autowired(required = false)
	private Comp1 comp1; //@Component

	@Autowired(required = false)
	private Service1 service1; // @Service

	@Qualifier("hiddenHttpMethodFilter")
	@Autowired
	Filter filter;

	//@Autowired
	//DelegatingFilterProxyRegistrationBean delegatingFilterProxyRegistrationBean;

	//@Autowired
	//HandlerMethodArgumentResolver handlerMethodArgumentResolver;

	//@Autowired
	//FilterRegistrationBean filterRegistrationBean;

	@Test
	public void testExplicitNotNullBeans() {

		Assert.assertNotNull(controller1);
		Assert.assertNotNull(advice1);
	}

	@Test
	public void testNullBeans() throws Exception {
		Assert.assertNull(comp1);
		Assert.assertNull(service1);
	}

	@Test
	public void testImplicitNotNullBeans() throws Exception {
		Assert.assertNotNull(webMvcConfigurer);
		Assert.assertNotNull(filter);
	}
}
