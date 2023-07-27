package com.example.garphqlserver;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    private static List<Policy> policies = Arrays.asList(
        new Policy(1001, "My Policy", "2021-01-01"),
        new Policy(1002, "My Other Policy", "2022-10-10")
    );

    private static Policy_Connection policy_connection = new Policy_Connection(
        List.of(new Policy_Edge("abc",new Policy(1001, "My Policy", "2021-01-01")),
            new Policy_Edge("xyz",
                new Policy(1002, "My Other Policy", "2022-10-10"))),new PageInfo("yes",false,false,"start"));

    public static Policy getById(int id) {
        return policies.stream()
            .filter(policy -> policy.getId() == id)
            .findFirst()
            .orElse(null);
    }

    public static Policy_Connection getAll() {
        return policy_connection;
    }
}
