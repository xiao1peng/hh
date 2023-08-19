package com.qf.lister;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletRequest request = srae.getServletRequest();
        Object uname = request.getAttribute("uname");
        System.out.println(uname+"++++++++++++++++++++++++++");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        ServletRequest request = srae.getServletRequest();
        Object uname = request.getAttribute("uname");
        System.out.println(uname+"-------------------------------");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        ServletRequest request = srae.getServletRequest();
        Object uname = request.getAttribute("uname");
        System.out.println(uname+"==================================");
    }
}
