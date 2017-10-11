package com.gk;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by pc on 2016/11/16.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.gk.dao")
public class JpaConfiguration {

}
