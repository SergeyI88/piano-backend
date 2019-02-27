package com.indyukov.piano.controllers;

import com.indyukov.piano.http.model.Page;
import com.indyukov.piano.http.requests.GetPageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
    @Autowired
    GetPageImpl getPage;
    @PostMapping("/getPage")
    @ResponseBody
    public Page getPage(@RequestParam("title") String title, @RequestParam("page") String page) {
       return Stream.of(Optional.ofNullable(getPage.get(title, Integer.parseInt(page))))
               .filter(Optional::isPresent)
               .peek(it -> it.get().setItems(it.get().getQuestions().stream()
                       .distinct()
                       .collect(Collectors.toList())))
               .findFirst().orElse(Optional.empty()).orElse(null);
    }
}
