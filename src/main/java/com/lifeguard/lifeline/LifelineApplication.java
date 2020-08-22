package com.lifeguard.lifeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LifelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifelineApplication.class, args);
    }

//    @Bean
//    public CorsFilter corsFilter() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        final CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowCredentials(true);
//        configuration.addAllowedHeader("*");
//        configuration.addAllowedOrigin("*");
//        configuration.addAllowedMethod(HttpMethod.OPTIONS);
//        configuration.addAllowedMethod(HttpMethod.GET);
//        configuration.addAllowedMethod(HttpMethod.PUT);
//        configuration.addAllowedMethod(HttpMethod.DELETE);
//        configuration.addAllowedMethod(HttpMethod.HEAD);
//        configuration.addAllowedMethod(HttpMethod.POST);
//        configuration.addAllowedMethod(HttpMethod.PATCH);
//        source.registerCorsConfiguration("/**", configuration);
//        return new CorsFilter(source);
//    }

//    @Bean
//    public Docket employeeApi()
//    {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("com.lifeguard.lifeline.controller"))
//                .build();
//    }

}
