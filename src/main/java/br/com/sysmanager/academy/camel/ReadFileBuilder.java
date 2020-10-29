package br.com.sysmanager.academy.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Davi-PC
 */

@Component
public class ReadFileBuilder extends RouteBuilder {
    private final String id = "ReadConsumersFile";
    private final String directoryName = "C:\\opt\\integracao\\lab";
    private final String fileName = "clientes.json";
    
    private final String uri = "file:" + directoryName + "?filename=" + fileName + "&delete=true";
    //private final String uri = "file:" + directoryName + "?filename=" + fileName + "&noop=true";

    @Override
    public void configure() throws Exception {
        from(uri).routeId(id)
            .log("Executando a leitura do arquivo de clientes...")
            .log("Conteudo do arquivo \"" + fileName + "\" ${body}")
            .process("TesteProcessor")
        .end();
    }
    
}
