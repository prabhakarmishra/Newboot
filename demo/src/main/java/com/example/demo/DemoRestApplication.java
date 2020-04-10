package com.example.demo;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.example.demo.config.ConfigTestController;
import com.example.demo.metric.MetricController;
import com.example.demo.resilient.ResilienceController;
import com.kumuluz.ee.discovery.annotations.RegisterService;


/**
 *
 */
@ApplicationPath("/data")
@RegisterService(value = "sample-service", environment = "dev", version = "1.0.0")
public class DemoRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        

        // resources
        classes.add(HelloController.class);
        
        classes.add(DiscoveryController.class);
        
        classes.add(ConfigTestController.class);
        
        
        classes.add(ResilienceController.class);
        
        
        classes.add(MetricController.class);
        
        

        return classes;
    }

}
