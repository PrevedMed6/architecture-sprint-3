package ru.yandex.practicum.smarthome.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Smart Home API", version = "1.0", description = "API documentation for Smart Home"))
public class OpenApiConfig {
}
