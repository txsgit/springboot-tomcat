package com.ktx.redis;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class RedisInterfaceImpl implements RedisInterface {
	@Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String get(String key) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    @Override
    public void set(String key, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value);
    }

    @Override
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public String hashGet(String hashKey, String key) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        return hashOperations.get(hashKey,key).toString();
    }

    @Override
    public void hashSet(String hashKey, String key, String value) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put(hashKey,key,value);
    }

    @Override
    public Map<String, Object> entries(String hashKey) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        return hashOperations.entries(hashKey);
    }

    @Override
    public void hashMapSet(String hashKey, Map<String, Object> map) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.putAll(hashKey,map);
    }

}
