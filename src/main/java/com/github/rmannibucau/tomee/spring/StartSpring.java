package com.github.rmannibucau.tomee.spring;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

// yes I assume to be lazy enough to not write a web.xml
public class StartSpring implements WebApplicationInitializer {
    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {
        servletContext.addListener(new ContextLoaderListener());
    }
}
