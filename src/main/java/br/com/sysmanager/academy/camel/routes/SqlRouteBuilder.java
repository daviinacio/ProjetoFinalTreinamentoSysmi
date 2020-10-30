package br.com.sysmanager.academy.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Davi-PC
 */
@Component
public class SqlRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:dbRoute")
            .routeId("dbRoute")
            .to("sql:classpath:sql/"+"insert into tabela values(a, b, c)?datasource=#datasource")
        .end();
    }
    
}
