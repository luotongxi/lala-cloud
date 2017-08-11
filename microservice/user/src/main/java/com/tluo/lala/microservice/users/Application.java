package com.tluo.lala.microservice.users;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


/**
 * Created by luotong on 2017/6/23.
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.tluo.lala.microservice.users.dao")
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    /**
     * DataSource配置
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DataSource();
    }

    /**
     * 生成SqlSessionFactory
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));  // 配置mybatis配置文件
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= LaLa Users Service Start Success =============");
    }
}
