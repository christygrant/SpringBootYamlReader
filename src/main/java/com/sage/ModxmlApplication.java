package com.sage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

// Added CommandLineRunner to basic generated app
@SpringBootApplication
public class ModxmlApplication implements CommandLineRunner {

    @Autowired
    private NodeConfiguration prodConfig;

    public static void main(String[] args) {

        SpringApplication.run(ModxmlApplication.class, args);
    }

    // This is for CommandLineRunner
    @Override
    public void run(String... args)  {

        List<Node> nodes = prodConfig.getProduction();

        for (Node node : nodes ) {
            System.out.println(node.getName() + " " + node.getHost());
        }
    }
}
