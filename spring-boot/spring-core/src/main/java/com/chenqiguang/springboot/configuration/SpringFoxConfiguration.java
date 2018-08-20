package com.chenqiguang.springboot.configuration;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.collect.Lists.newArrayList;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SpringFoxConfiguration {

    @Bean
    public Docket restDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .groupName("rest");
    }

    @Bean
    public Docket apiV1Docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .securitySchemes(apiKeys())
                .securityContexts(securityContexts())
                .select()
                .paths(PathSelectors.regex("/api-v1/.*"))
                .build()
                .groupName("api-v1");

    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("REST SWAGGER")
                .version("1.0.0")
                .description("CHENQIGUANG REST SWAGGER")
                .build();
    }

    private List<ApiKey> apiKeys() {
        return newArrayList(
                new ApiKey("X-Access-Token", "X-Access-Token", "header"),
                new ApiKey("X-Operation-Token", "X-Operation-Token", "header")
        );
    }

    private List<SecurityContext> securityContexts() {
        return newArrayList(
                SecurityContext.builder()
                        .securityReferences(defaultAuth())
                        .forPaths(PathSelectors.regex("/security/.*"))
                        .build()
        );
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return newArrayList(
                new SecurityReference("X-Access-Token", authorizationScopes),
                new SecurityReference("X-Operation-Token", authorizationScopes));
    }
}
