# SpringMVC
Tạo một project Spring MVC bằng inteliji 
1 ... khởi tạo maven project webapp
2..... thêm dependency Springwebmvc và servlet api
3....conflig DispathcherServlet


     <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>4.3.3.RELEASE</version>
    </dependency>

      <bean id="ViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"></property>
        <property name="suffix" value=".jsp"></property>
    </bean>
