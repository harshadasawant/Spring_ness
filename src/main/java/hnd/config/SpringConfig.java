package hnd.config;

import hnd.bean.WelcomeBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
@ComponentScan(basePackages = "hnd")
public class SpringConfig {
@Bean
public WelcomeBean welcomeBean() {
return new WelcomeBean();
}
}
