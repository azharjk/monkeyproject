package com.github.azharjk.monkeyproject.api;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PingQuery {
    @QueryMapping
    public String ping() {
        return "pong";
    }
}
