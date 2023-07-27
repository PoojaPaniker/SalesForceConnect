package com.example.garphqlserver;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Policy_Connection {
    private List<Policy_Edge> edges;
    private PageInfo pageInfo;
}
