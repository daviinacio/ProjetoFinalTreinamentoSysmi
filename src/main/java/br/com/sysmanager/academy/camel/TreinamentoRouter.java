
package br.com.sysmanager.academy.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 *
 * @author Davi-PC
 */
@Component
public class TreinamentoRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        
        from("timer:/hello?period={{timer.period}}")
            .routeId("rota1")
            .log("Hello World!")
            .to("direct:expressionLanguage")
            //.setBody(simple("Teste de escrita"))
            //.setHeader("CamelFileName", simple("${id}.txt"))
            //.to("file://home/")
            .log("Escrevi no arquivo")
        .end();
    }
    
}
