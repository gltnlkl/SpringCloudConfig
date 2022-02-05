package com.gulukal.limitsservice;

import com.gulukal.limitsservice.bean.Limits;
import com.gulukal.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());
//		return new Limits(1,1000);
    }



    @GetMapping("/limits/normal")
    public Limits retievecheckLimits(){

        return new Limits(1,1000);

    }
}
