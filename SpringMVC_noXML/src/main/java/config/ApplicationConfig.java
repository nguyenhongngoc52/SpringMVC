package config;

import formatter.phoneNumberFormatter;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

import java.util.Properties;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"controller", "Service"})
@PropertySource("classpath:email.properties")
public class ApplicationConfig implements WebMvcConfigurer {

    @Autowired
    private Environment evn;

    Logger logger = Logger.getLogger(ApplicationConfig.class.getName());

    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        System.out.println("inside addFormatter method ");
        registry.addFormatter(new phoneNumberFormatter());
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("messages");
        return resourceBundleMessageSource;
    }

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());
        return localValidatorFactoryBean;
    }

    @Override
    public Validator getValidator() {
        return localValidatorFactoryBean();
    }

    @Bean
    public JavaMailSender configureJavaMailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        logger.info("Info message : "+evn.getProperty("mail.host"));
        javaMailSender.setHost(evn.getProperty("mail.host"));
        javaMailSender.setUsername(evn.getProperty("mail.username"));
        javaMailSender.setPassword(evn.getProperty("mail.password"));
        javaMailSender.setPort(getProperties("mail.port"));
        javaMailSender.setJavaMailProperties(getProperties());
        return javaMailSender;
    }

    private Properties getProperties() {
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.starttls.enable", true);
        mailProperties.put("mail.smtp.ssl.trust", true);
        return mailProperties;
    }

    public int getProperties(String key) {
        String keyNumber = evn.getProperty(key);
        return Integer.parseInt(keyNumber);
    }

}
