package com.kelimelik.server.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends CrudRepository<Word, Long> {

    @Query(value = "select * from wordlist w where trim(w.text) = ?1",nativeQuery = true)
    List<Word> getByText(String text);

    @Query(value = "select count(*) from wordlist w where trim(w.text) = ?1",nativeQuery = true)
    int textCount(String text);

}
