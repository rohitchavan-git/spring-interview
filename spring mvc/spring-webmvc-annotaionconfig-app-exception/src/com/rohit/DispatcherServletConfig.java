package com.rohit;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.rohit.config.DSContainerConfig;
import com.rohit.config.RootContainerConfig;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return  new Class[]{RootContainerConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{DSContainerConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/app/*"};
	}

}
