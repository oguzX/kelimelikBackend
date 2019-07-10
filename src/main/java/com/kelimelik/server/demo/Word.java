package com.kelimelik.server.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wordlist")
@Data
public class Word {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
}
