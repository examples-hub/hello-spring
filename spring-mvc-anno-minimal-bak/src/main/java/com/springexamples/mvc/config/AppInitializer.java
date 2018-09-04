package com.springexamples.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

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

    /*
   设置Multipart具体细节（必须）
   指定文件存放的临时路径
   上传文件最大容量
   整个请求的最大容量
   0表示将所有上传的文件写入到磁盘中
  */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(
                new MultipartConfigElement("/root/Downloads",20971520,41943040,0));
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        super.onStartup(servletContext);

    }


}
