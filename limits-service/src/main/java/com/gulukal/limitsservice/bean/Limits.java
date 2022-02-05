package com.gulukal.limitsservice.bean;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter


public class Limits {
    private int minimum;
    private int maximum;
}
  