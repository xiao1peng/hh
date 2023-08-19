package com.qf.lister;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyRequestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("请求了");
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("关闭请求了");
    }
}
