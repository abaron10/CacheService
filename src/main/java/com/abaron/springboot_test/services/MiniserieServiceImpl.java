package com.abaron.springboot_test.services;

import org.springframework.stereotype.Service;

@Service
public class MiniserieServiceImpl<T> implements miniserieService {


    Cache cache;

    public MiniserieServiceImpl() {
        this.cache = new Cache<String>(3);
    }

    public Object getValue(Integer id){
      return  cache.cacheGetSearch(id);
    }
    public Boolean putValue(Integer id , Object save){
        cache.cachePutSearch(id,save);
        return true;
    }

}
