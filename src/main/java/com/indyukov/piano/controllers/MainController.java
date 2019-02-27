package com.indyukov.piano.controllers;

import com.indyukov.piano.http.model.Page;
import com.indyukov.piano.http.requests.GetPageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
       return Stream.of(getPage.get(title, Integer.parseInt(page)))
               .peek(it -> it.pages = it.pages.stream()
                       .distinct()
                       .collect(Collectors.toList()))
               .findFirst().get();
    }
}
