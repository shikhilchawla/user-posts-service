package org.phoenix.apps.community.post;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title = "User Posts microservice",
        version = "1.0", description = "This microservice will run CRUD operations on user posts in a community."))
public class UserPostsApplication {
    public static void main (String[] args){
        SpringApplication.run(UserPostsApplication.class);
    }
}
