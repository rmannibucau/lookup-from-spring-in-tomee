package com.github.rmannibucau.tomee.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;

@DependsOn("cf") // just there to show something
public class JmsLookup implements ApplicationContextAware {
    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(applicationContext.getBean("cf"));
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
