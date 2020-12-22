package com.training.ykb.rest.design1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person/search")
public class PersonSearchRest {

    @GetMapping
    public String getAll(@RequestParam("id") final long id) {
        return "OK";
    }


}
