package com.springbootproject.example.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class CustomSitemeshFilter extends ConfigurableSiteMeshFilter{
	
	@Override
	protected void applyCustomConfiguration (SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "web.jsp")
		.addDecoratorPath("/admin/*", "admin.jsp")
		.addDecoratorPath("/web/account/*", "login.jsp")
				/*
				 * .addExcludedPath("/login*").addExcludedPath("/login/*")
				 * .addExcludedPath("/alogin*").addExcludedPath("/alogin/*")
				 */
		.addExcludedPath("/api/**");
	}

}
