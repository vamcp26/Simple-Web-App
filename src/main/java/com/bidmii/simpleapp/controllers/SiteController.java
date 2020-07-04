package com.bidmii.simpleapp.controllers;

import com.bidmii.simpleapp.Repos.MainRepo;
import com.bidmii.simpleapp.entities.MainEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SiteController {
    private final MainRepo mainRepo;

    public SiteController(MainRepo mainRepo) {
        this.mainRepo = mainRepo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String index(Model model) {
        model.addAttribute("action", new MainEntity());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)

    public String formSubmit(@ModelAttribute MainEntity action) {
        mainRepo.save(action);
        return "result";
    }
}

