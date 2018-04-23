package com.springexamples.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Root level configurations
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{};
    }

    // Servlet level configuration
    // Useful if you have multiple dispatcher servlets
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    // DispatcherServlet mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
