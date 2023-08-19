package com.qf.lister;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        ServletContext servletContext = scae.getServletContext();
        Object uname = servletContext.getAttribute("uname");
        System.out.println(uname+"++++++++++++++++");

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        ServletContext servletContext = scae.getServletContext();
        Object uname = servletContext.getAttribute("uname");
        System.out.println(uname+"-------------------");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        ServletContext servletContext = scae.getServletContext();
        Object uname = servletContext.getAttribute("uname");
        System.out.println(uname+"========================");
    }
}
