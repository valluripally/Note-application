package com.stackroute.keepnote.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/*This class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
 * class in Servlet 3.0+ environments in order to configure the ServletContext 
 * programmatically -- as opposed to the traditional web.xml-based approach. By overriding the methods of
 * class, we can define the Configuration classes and root mapping so that our application can gets
 * into spring.
 */

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return new Class[] {ApplicationContextConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

	

}
