package com.gulukal.limitsservice.configuration;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter


@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimum;
    private int maximum;
}
