package org.example;

import org.apache.camel.builder.RouteBuilder;

public class MyRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("jms:queue:myqueue")
                .log("received-message ${body}");
    }
}
