package com.chenqiguang.springboot.configuration.redis;

import com.alibaba.fastjson.parser.ParserConfig;
import com.chenqiguang.springboot.configuration.redis.serializer.FastJsonRedisSerializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;

@EnableCaching
@Configuration
public class RedisConfig {

    /**
     * 添加白名单的路径,
     * 全局开启AutoType，不建议使用
     * ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
     */
    private final String autoTypePath = "com.chenqiguang.springboot.domain.";

    /**
     * redis默认的序列化方式是jdkSerializer，自定义序列化方式
     * 经过实验，jdk使用内存是fastjson 4.17/2.77 = 1.5倍
     *
     * @param redisConnectionFactory
     * @return
     * @throws UnknownHostException
     */
    @Bean
    public RedisTemplate<Object, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {
        RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
        template.setConnectionFactory(redisConnectionFactory);
        FastJsonRedisSerializer<Object> serializer = new FastJsonRedisSerializer<Object>(Object.class);
//        ParserConfig.getGlobalInstance().addAccept(autoTypePath);
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        template.setDefaultSerializer(serializer);
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        return template;
    }
}
