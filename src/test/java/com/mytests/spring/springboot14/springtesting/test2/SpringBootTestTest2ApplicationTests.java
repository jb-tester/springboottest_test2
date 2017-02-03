package com.mytests.spring.springboot14.springtesting.test2;

import com.mytests.spring.springboot14.springtesting.extra_configs.B1;
import com.mytests.spring.springboot14.springtesting.extra_configs.Conf0;
import com.mytests.spring.springboot14.springtesting.test2.components.Comp1;
import com.mytests.spring.springboot14.springtesting.test2.components.Service1;
import com.mytests.spring.springboot14.springtesting.test2.controllers.Controller1;
import com.mytests.spring.springboot14.springtesting.test2.controllers.ControllerAdvice1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(Conf0.class)
public class SpringBootTestTest2ApplicationTests {

	@Autowired
	B1 b1;  // bean is defined in the imported Conf0 configuration class

	@Autowired
	private Comp1 comp1;
	@Autowired
	private Service1 service1;
	@Autowired
	private Controller1 controller1;

	@Autowired
	private ControllerAdvice1 advice1;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(comp1);
		Assert.assertNotNull(service1);
		Assert.assertNotNull(controller1);
		Assert.assertNotNull(advice1);
		Assert.assertNotNull(b1);
	}

}
