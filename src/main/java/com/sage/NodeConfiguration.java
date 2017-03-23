package com.sage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties ("nodes")
public class NodeConfiguration {

    // Magic name matches yaml
    private List<Node> production = new ArrayList<>();

    public List<Node> getProduction() {
        return this.production;
    }
}
