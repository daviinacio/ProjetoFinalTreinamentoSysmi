package br.com.sysmanager.academy.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/**
 * @author Davi-PC
 */

@Component
public class PacienteApiRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        rest("/pacientes")
            .description("Api de Pacientes")
            .consumes(MediaType.APPLICATION_JSON_VALUE)
            .produces(MediaType.APPLICATION_JSON_VALUE)
            .get()
                .description("Consulta Pacientes")
                
                .param().name("city")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(true)
                .endParam()
                
                .responseMessage()
                    .code(200)
                    .message("Ok, processamento recebido")
                .endResponseMessage()
                
                .route()
                    .id("get-api-pacientes")
                    .log("Estou na rota de pacientes...")
                    .log("Processando...")
                .end()
            .endRest();
        ;
    }
    
}
