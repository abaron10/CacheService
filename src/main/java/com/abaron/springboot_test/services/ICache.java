package com.abaron.springboot_test.services;

public interface ICache<T>{
    T cacheGetSearch(Integer id);
    void cachePutSearch(Integer key,T value);
}
