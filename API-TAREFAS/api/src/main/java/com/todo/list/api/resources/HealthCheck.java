package com.todo.list.api.resources;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class HealthCheck {
    private static Map<String, String> alwaysOk = Collections.singletonMap("status", "OK");

    @GetMapping("/healthcheck")
    @ApiOperation(value="Retorna o estado da API")
    public Map<String,String> healthCheck() {
        return alwaysOk;
    }
    
    
}
