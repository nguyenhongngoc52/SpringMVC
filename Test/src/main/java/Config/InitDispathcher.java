package Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InitDispathcher extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] arr = {TestConfig.class};
        return arr;
    }

    @Override
    protected String[] getServletMappings() {
        String[] arr = {"/"};
        return arr;
    }
}
