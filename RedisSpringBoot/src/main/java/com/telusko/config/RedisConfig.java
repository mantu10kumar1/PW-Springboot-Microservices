package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.telusko.model.Country;

@Configuration
public class RedisConfig {

	// Jedis ConnectionFactory
	
	@Bean
	public JedisConnectionFactory jedisConnection() {
		JedisConnectionFactory jedis = new JedisConnectionFactory();
//		redis server config
//		jedis.setPort(2000);
		
		return jedis;
	}
	
	// redis template
	@Bean
	public RedisTemplate<String, Country> redisTemplate(){
		RedisTemplate<String, Country> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnection());
		return redisTemplate;
	}
}
