package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"Controller"})
public class MyAppConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //set tien to cho file muon tra ve o controller
        viewResolver.setPrefix("/WEB-INF/view/");
        //set hau to cho file muon tra ve o controller
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
