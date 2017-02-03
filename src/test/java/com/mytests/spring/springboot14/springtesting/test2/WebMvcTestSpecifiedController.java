package com.mytests.spring.springboot14.springtesting.test2;

import com.mytests.spring.springboot14.springtesting.test2.components.Comp1;
import com.mytests.spring.springboot14.springtesting.test2.controllers.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/24/2017.
 * Project: springboottest_test2
 * *******************************
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {Controller3.class, Controller2.class})
public class WebMvcTestSpecifiedController {


    @Autowired
    private Controller2 controller2;
    @Autowired
    private Controller3 controller3;
    @Autowired
    private ControllerAdvice2 controllerAdvice2;
    @Autowired
    private ControllerAdvice1 controllerAdvice1;


    @Autowired(required = false)
    private Controller1 controller1; // should not be available

    @Autowired(required = false)
    private Comp1 comp1;

    @Test
    public void testNotNullBeans() throws Exception {
        Assert.assertNotNull(controller2);
        Assert.assertNotNull(controller3);
        Assert.assertNotNull(controllerAdvice1);
        Assert.assertNotNull(controllerAdvice2);

    }

    @Test
    public void testNullBeans() throws Exception {
        Assert.assertNull(controller1);
        Assert.assertNull(comp1);
    }
}
