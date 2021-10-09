package com.tadas.demo.config;

import com.tadas.demo.entity.Category;
import com.tadas.demo.entity.Answers;
import com.tadas.demo.entity.Question;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Question.class).exposeIdsFor(Answers.class).exposeIdsFor(Category.class);
    }
}
