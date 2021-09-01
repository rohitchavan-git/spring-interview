package com.rohit;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.rohit.config.DSContainerConfig;
import com.rohit.config.ProjectSecurityConfig;
import com.rohit.config.RootContainerConfig;

public class DSConfigInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		 return new Class[] { DSContainerConfig.class, ProjectSecurityConfig.class };
		}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { RootContainerConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/app/*" };
	}

}
