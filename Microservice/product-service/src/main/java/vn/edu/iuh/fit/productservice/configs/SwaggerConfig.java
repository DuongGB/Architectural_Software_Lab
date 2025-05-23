/**
 * @ (#) SwaggerConfig.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.productservice.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/*
 * @description:
 * @author: NguyenTan Thai Duong
 * @date: 4/12/2025
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI productOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Product Service API")
                        .description("API documentation for Product Service")
                        .version("1.0.0"))
                .servers(List.of(new Server().url("http://localhost:8083")));
    }

    @Bean
    public GroupedOpenApi productApi() {
        return GroupedOpenApi.builder()
                .group("Product Service")
                .pathsToMatch("/products/**") // Đảm bảo path chính xác
                .build();
    }
}
