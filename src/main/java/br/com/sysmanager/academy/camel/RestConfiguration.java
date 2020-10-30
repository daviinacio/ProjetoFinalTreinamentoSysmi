package br.com.sysmanager.academy.camel;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Davi-PC
 */

//@Configuration
public class RestConfiguration {
    
    //@Value("${app.context.name}")
    private String appContextName;
    
    //@Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servlet = new ServletRegistrationBean(
                new CamelHttpTransportServlet(), "/" + appContextName + "/"
        );
        servlet.setName("CamelServlet");
        
        return servlet;
    }
}
