package com.olts.activity.evenoroddprocess;

import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.springframework.stereotype.Service;

/**
 * o.tsoy
 * 22.03.2017
 */
@Service(value = "printDigitService")
public class PrintDigitService {

    public void printOdd(ActivityExecution execution) {
        System.out.println("ODD");
        Object executionVariable = execution.getVariable(Constants.GENERATED_NUMBER);
        System.out.println(executionVariable);
    }

    public void printEven(ActivityExecution execution) {
        System.out.println("EVEN");
        Object executionVariable = execution.getVariable(Constants.GENERATED_NUMBER);
        System.out.println(executionVariable);
    }
}
