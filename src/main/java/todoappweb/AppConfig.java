package todoappweb;

import org.apache.taglibs.standard.tlv.JstlBaseTLV;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "todoappweb.app")
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean(name="view")
	public ViewResolver viewResolver(){
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setViewClass(JstlView.class);
	    view.setPrefix("WEB-INF/views/");
	    view.setSuffix(".jsp");
		return view;
	}
}
