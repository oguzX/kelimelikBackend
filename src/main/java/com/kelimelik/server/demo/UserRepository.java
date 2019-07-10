package com.kelimelik.server.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Query(value="Select * from user order by score desc limit 10",nativeQuery = true)
    List<User> getTop10();

}
