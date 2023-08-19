package com.qf.lister;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("销毁了");
    }
}
