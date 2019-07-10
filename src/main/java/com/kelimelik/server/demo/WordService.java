package com.kelimelik.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WordService {
    @Autowired
    WordRepository wordRepository;

    public Word getWordById(Long id){
        Optional<Word> wordOptional = wordRepository.findById(id);
        if(wordOptional.isPresent()){
            wordOptional.get();
        }
        return null;
    }

    public String findByText(String _text){
        return wordRepository.getByText(_text).toString();
    }

    public boolean wordIsExist(String _text){
        return wordRepository.textCount(_text)>0? true:false;
    }

    public long wordCount(){
        return wordRepository.count();
    }
}
