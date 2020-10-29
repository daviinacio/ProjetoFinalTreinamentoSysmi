package br.com.sysmanager.academy.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author Davi-PC
 */
public class TesteProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Passei aqui no Processor");
        System.out.println(exchange.getIn().getBody());
    }
    
}
