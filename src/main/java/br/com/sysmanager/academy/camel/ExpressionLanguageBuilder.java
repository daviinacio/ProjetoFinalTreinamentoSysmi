package br.com.sysmanager.academy.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Davi-PC
 */

@Component
public class ExpressionLanguageBuilder extends RouteBuilder {
    
    @Override
    public void configure() throws Exception {
        final String routeId = "expressionLanguageID";
        final String uri = "direct:expressionLanguage";
        
        from(uri).routeId(routeId)
            .log("Executando a: " + routeId)
            .log("Escrevendo na saida padrão: ${body}")
            .log("Conteudo da mensagem impresso")
        .end();
    }
    
}
