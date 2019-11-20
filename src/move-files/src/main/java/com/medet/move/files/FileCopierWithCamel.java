package com.medet.move.files;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopierWithCamel {

    public static void main(String... args) throws Exception {
        System.out.println("Hello World");
        final CamelContext context = new DefaultCamelContext();
        context.addRoutes(
            new RouteBuilder() {
                @Override
                public void configure() {
                    from("file:data/inbox?noop=true").to("file:data/outbox");
                }
            }
        );
        context.start();
        Thread.sleep(5000);
        context.stop();
    }

}