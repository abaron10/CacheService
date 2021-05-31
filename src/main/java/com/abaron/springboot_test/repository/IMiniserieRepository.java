package com.abaron.springboot_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMiniserieRepository extends JpaRepository<Miniserie,Integer> {
    @Query("select c from Miniserie c where c.id =?1")
    //@Query(value = "SELECT * FROM Miniserie u WHERE u.id = ?1", nativeQuery = true)
    Optional<Miniserie> findById(Integer id);
}
