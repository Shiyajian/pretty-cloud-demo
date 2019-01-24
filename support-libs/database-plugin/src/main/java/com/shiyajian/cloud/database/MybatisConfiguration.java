package com.shiyajian.cloud.database;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @author shiyajian
 * create: 2019-01-17
 */
public class MybatisConfiguration {


    @Primary
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactory(){
        return null;
    }
}
