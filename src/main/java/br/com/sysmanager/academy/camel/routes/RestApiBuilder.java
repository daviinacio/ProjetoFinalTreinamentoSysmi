package br.com.sysmanager.academy.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Davi-PC
 */

@Component
public class RestApiBuilder extends RouteBuilder {
    
    @Value("${app.port}")
    private int port;

    @Override
    public void configure() throws Exception {
        restConfiguration()
            .enableCORS(true)
            .component("servlet")
            .bindingMode(RestBindingMode.json)
        ;
    }
    
}
