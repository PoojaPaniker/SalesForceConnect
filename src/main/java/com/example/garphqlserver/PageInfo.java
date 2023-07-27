package com.example.garphqlserver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PageInfo {
    private String endCursor;
    private boolean hasNextPage;
    private boolean hasPreviousPage ;
    private String startCursor;
}
