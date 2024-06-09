package com.springbootlearning.learningspringboot3.ch2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

record Video(String name) {

    static List<Video> videos = List.of(
            new Video("Need HELP with your SPRING BOOT 3 App?"),
            new Video("Don't do THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!")
    );

    @GetMapping
    public String index (Model model) {
        model.addAttribute("videos", videos);
        return "index";
    }

}
