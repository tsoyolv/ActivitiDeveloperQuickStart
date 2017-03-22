package com.olts.activity.evenoroddprocess;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 * o.tsoy
 * 22.03.2017
 */
@Service
public class NumberGenerator implements JavaDelegate {

    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long someData = Calendar.getInstance().getTimeInMillis() % 2;
        delegateExecution.setVariable(Constants.GENERATED_NUMBER, someData);
        System.out.println("Generate Number task.");
    }
}
