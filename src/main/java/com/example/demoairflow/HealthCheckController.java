package com.example.demoairflow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @Value("${param-test}")
    private String paramTest;

    @GetMapping("/api/v1/test-build")
    public String getExample() {
        return paramTest;
    }
}
