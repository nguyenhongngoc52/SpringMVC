package config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class LoveCalculatoerApplicationInitializer{// implements WebApplicationInitializer {
    //@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//        webApplicationContext.setConfigLocation("classpath:application-config.xml");
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(ApplicationConfig.class);
        //create a dispathcher servlet object
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        //register the dispathcher servlet with servlet context
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("myDispathcherServlet" , dispatcherServlet);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/home/*");
    }
}
