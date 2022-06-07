package com.bytehonor.sdk.starter.redis.service;

public interface RedisCacheService {

    public String kvGet(String key);

    public void kvPut(String key, String value);

    public void delete(String key);

    public void expireAt(String key, long timestamp);

    public void increament(String key);
    
    public void resetCount(String key);

    public int getCount(String key);

    public boolean lock(String key, long millis);
}