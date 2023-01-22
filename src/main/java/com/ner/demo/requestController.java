package com.ner.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.stanford.nlp.simple.Sentence;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/api/ner")
public class requestController {
    
    @GetMapping
    public String ner() {
      log.info("Sentence: {}", "Lisa is American, but she lives in Taiwan.");
      Sentence sent = new Sentence("Lisa is American, but she lives in Taiwan.");
      log.info("Tags: {}", sent.nerTags());
      return "Lisa is American, but she lives in Taiwan.";
    }
}
