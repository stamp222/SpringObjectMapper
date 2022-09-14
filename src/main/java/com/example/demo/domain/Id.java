package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Id {
    @JsonProperty("$oid")
    public String oid;
}
