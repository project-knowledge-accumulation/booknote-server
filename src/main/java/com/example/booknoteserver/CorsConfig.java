//package com.example.booknoteserver;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public FilterRegistrationBean<CorsFilter> corsFilter() {
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("*"); // Set the allowed origin, e.g., "*" for any origin or specify a specific origin
//        config.addAllowedMethod("*"); // Set the allowed HTTP methods, e.g., "*" for any method or specify specific methods
//        config.addAllowedHeader("*"); // Set the allowed headers, e.g., "*" for any header or specify specific headers
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config); // Apply the CORS configuration to all URLs
//
//        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
//        bean.setOrder(0); // Set the filter order to highest precedence
//
//        return bean;
//    }
//}
