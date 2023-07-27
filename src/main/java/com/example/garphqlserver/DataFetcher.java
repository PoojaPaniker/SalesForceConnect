package com.example.garphqlserver;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import java.util.List;
import lombok.AllArgsConstructor;

    @DgsComponent
    @AllArgsConstructor
    public class DataFetcher {

        @DgsQuery
        public Policy_Connection Policy(DgsDataFetchingEnvironment environment,
                                     @InputArgument(name = "limit") Integer limit,
                                     @InputArgument(name = "offset") Integer offset,
                                     @InputArgument(name = "orderBy") List<String> OrderByInput,
                                     @InputArgument(name = "where") String whereInput,
                                     @InputArgument(name = "first") String first,
                                     @InputArgument(name = "after") String after) {
            System.out.println("are we here ?");
            return PolicyService.getAll();
        }
    }

