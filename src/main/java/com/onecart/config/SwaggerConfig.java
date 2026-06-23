/**
 * Swagger/OpenAPI Configuration
 *
 * Purpose:
 * - Automatically generates API documentation for all REST endpoints.
 * - Provides Swagger UI for testing APIs directly from the browser.
 * - Displays API metadata such as title, version, description, contact, and license information.
 * - Helps frontend developers, testers, and other developers understand and use the APIs.
 *
 * Access Swagger UI:
 * http://localhost:8080/swagger-ui/index.html
 */

package com.onecart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {

        return new OpenAPI()
                .info(
            new Info()
                    .title("OneCart API")
                     .description("REST API documentation for OneCart E-Commerce Platform")
                     .version("v1.0.0")
                        .contact(
                              new Contact()
                                    .name("Abhishek ")
                                      .email("abhihivarkar783@gmail.com")
                                       .url("https://github.com/Abhishekhivarkar"))
                     .license(
                                        new License()
                                   .name("Apache 2.0")
                                       .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("OneCart Documentation")
                                .url("https://github.com/Abhishekhivarkar/OneCart"));
    }
}