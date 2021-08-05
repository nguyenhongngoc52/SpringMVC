package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class arr [] = {ApplicationConfig.class};
        return arr;
    }

    @Override
    protected String[] getServletMappings() {
        String arr[] = {"/"};
        return arr;
    }
}
