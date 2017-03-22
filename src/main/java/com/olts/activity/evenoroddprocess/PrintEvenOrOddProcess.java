package com.olts.activity.evenoroddprocess;

import org.activiti.engine.RuntimeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * o.tsoy
 * 22.03.2017
 */
public class PrintEvenOrOddProcess {

    public static void main(String[] args) {
        // Create Spring context
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("appContext.xml");

        // Start process
        RuntimeService runtimeService = (RuntimeService) applicationContext.
                getBean("runtimeService");
        runtimeService.startProcessInstanceByKey("evenOrOddNumber");
    }
}
