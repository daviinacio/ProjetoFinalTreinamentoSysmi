/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            .routeId("Primeira rota do treinamento")
            .log("Hello World!")
            .setBody(simple("Teste de escrita"))
            .setHeader("CamelFileName", simple("${id}.txt"))
            .to("file://home/")
            .log("Escrevi no arquivo")
        .end();
    }
    
}
