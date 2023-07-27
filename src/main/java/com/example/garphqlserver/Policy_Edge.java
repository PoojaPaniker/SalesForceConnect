package com.example.garphqlserver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Policy_Edge {
    private String cursor;
    private Policy node;
}
