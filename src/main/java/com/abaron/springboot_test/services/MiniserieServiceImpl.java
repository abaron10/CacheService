package com.abaron.springboot_test.services;

import com.abaron.springboot_test.repository.IMiniserieRepository;
import org.springframework.stereotype.Service;

@Service
public class MiniserieServiceImpl<T> implements miniserieService {

    IMiniserieRepository IMiniserieRepository;
    Cache cache;

    public MiniserieServiceImpl(IMiniserieRepository IMiniserieRepository) {
        this.IMiniserieRepository = IMiniserieRepository;
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
