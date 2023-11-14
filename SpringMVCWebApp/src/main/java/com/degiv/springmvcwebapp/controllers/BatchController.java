package com.degiv.springmvcwebapp.config;

import com.degiv.springmvcwebapp.dao.PersonDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-batch-update")
public class BatchController {
    private final PersonDAO personDAO;
    @GetMapping()
    public String index() {
        return "batch/index";
    }

    @GetMapping("/without")
    public String withoutBatch() {

    }
}
