package com.kelimelik.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping("/word/getbyid/{id}")
    public Word allwords(@PathVariable Long id){
        return wordService.getWordById(id);
    }

    @GetMapping("/word/wordexist/{text}")
    public boolean textExist(@PathVariable String text){
        return wordService.wordIsExist(text);
    }

    @GetMapping("/word/count")
    public Long count(){
        return wordService.wordCount();
    }
}