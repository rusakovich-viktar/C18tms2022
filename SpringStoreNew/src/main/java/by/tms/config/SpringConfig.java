package by.tms.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@EnableWebMvc
@ComponentScan("by.tms")
@PropertySource("classpath:application.properties")
@RequiredArgsConstructor
public class SpringConfig implements WebMvcConfigurer {
    private final Environment environment;

    @Bean
    public ViewResolver UrlBasedViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/views/resources/");
        registry.addResourceHandler("/favicon.ico").addResourceLocations("/images/favicon.ico");
    }

    @Bean
    public Connection connection() {
        String dbURl = environment.getProperty("db.url");
        String dbUser = environment.getProperty("db.login");
        String dbPassword = environment.getProperty("db.password");
        String dbDriver = environment.getProperty("db.driver");
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbURl, dbUser, dbPassword);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // LogInterceptor apply to all URLs.
//        registry.addInterceptor(new LogInterceptor());
//    }
}