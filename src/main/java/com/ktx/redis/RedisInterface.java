package com.ktx.redis;

import java.util.Map;

public interface RedisInterface {

	

    boolean hasKey(String key);

    //String
    String get(String key);
    void  set(String key, String value);

    //Hash
    String hashGet(String hashKey,String key);
    void hashSet(String hashKey,String key,String value);
    Map<String,Object> entries(String hashKey);
    void hashMapSet(String hashKey, Map<String,Object> map);

    //list

}
