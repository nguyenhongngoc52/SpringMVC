package Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }


    //loading bean controller
    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] config = {MyAppConfig.class};
        return config;
    }


    //set up the mapping that the DS going to handle
    //co the xu ly nhieu url nen moi co kieu tra ve la mot mang String
    @Override
    protected String[] getServletMappings() {
        String [] mappings = {"/"};
        return mappings;
    }
}
