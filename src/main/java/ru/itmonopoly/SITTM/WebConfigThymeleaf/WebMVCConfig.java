package ru.itmonopoly.SITTM.WebConfigThymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("ru.itmonopoly.SITTM.Controller")
public class WebMVCConfig implements WebMvcConfigurer {

		@Autowired
		private ApplicationContext applicationcontext;
		@Bean
		public SpringResourceTemplateResolver TemplateResolver() {
			SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
			templateResolver.setApplicationContext(applicationcontext);
			templateResolver.setPrefix("/WEB-INF/views/");
			templateResolver.setSuffix(".html");
			return templateResolver;
		}

	@Bean
	 public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(TemplateResolver());
		templateEngine.setEnableSpringELCompiler(true);
		return templateEngine;
		
	}
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		registry.viewResolver(viewResolver);
		
	}
}
