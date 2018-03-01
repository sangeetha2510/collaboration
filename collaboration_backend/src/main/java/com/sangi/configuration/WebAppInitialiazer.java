package com.sangi.configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitialiazer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	 public  WebAppInitialiazer() {
	      System.out.println("WEBAPPINITIALIAZER is Instantiated");
	 }
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{DBConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return  new Class[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"/"};
	}
	

}

