# CacheService
A cache is a reserved storage location that collects temporary data to help websites, browsers, and apps load faster. Whether it's a computer, laptop or phone, web browser or app, you'll find some variety of a cache. 

A cache makes it easy to quickly retrieve data, which in turn helps devices run faster. It acts like a memory bank, making it easy to access data locally instead of redownloading it every time you visit a website or open an app.

## 1. Implementation LRU Cache:
The Least Recently Used (LRU) cache is a cache eviction algorithm that organizes elements in order of use. In LRU, as the name suggests, the element that hasn't been used for the longest time will be evicted from the cache.

For example, if we have a cache with a capacity of three items:

<p align="center">
<img src="https://user-images.githubusercontent.com/64280930/149995234-6f4f23f3-5c8d-4ec9-b914-4292e0b4a56c.png">
</p>
 

Initially, the cache is empty, and we put element 8 in the cache. Elements 9 and 6 are cached as before. But now, the cache capacity is full, and to put the next element, we have to evict the least recently used element in the cache.

Some aspects of the cache:

- All operations should run in order of O(1)
- The cache has a limited size
- It's mandatory that all cache operations support concurrency
- If the cache is full, adding a new item must invoke the LRU strategy
<p align="center">
<img src="https://user-images.githubusercontent.com/64280930/149994691-7c7699f7-13ad-4b66-a29c-9a9e07024f0d.png">
</p>

## Steps of the developed cache:

1. Add a new element in front of the list.
2. Add a new entry in HashMap and refer to the head of the list.
3. And, we'll do two steps after a cache hit:
4. Remove the hit element and add it in front of the list.
5. Update HashMap with a new reference to the front of the list.

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch 
3. Commit your Changes 
4. Push to the Branch 
5. Open a Pull Request

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

<!-- CONTACT -->
## Contact

https://www.linkedin.com/in/andres-baron-sandoval-76ab96186/ - af.baron10@uniandes.edu.co

Project Link: [https://github.com/abaron10/CacheService](https://github.com/abaron10/CacheService)
