package com.mkyong.helloworld;

import java.io.File;
import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;


public class MainApp {


    public static void main(String[] args) throws LifecycleException, ServletException {


        String webappDirLocation = "spring-mvc-anno/src/main/webapp/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(
                webappDirLocation).getAbsolutePath());
        ctx.setReloadable(false);
        File additionWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources,
                "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(),
                "/"));
        tomcat.start();
        tomcat.getServer().await();


    }


}
