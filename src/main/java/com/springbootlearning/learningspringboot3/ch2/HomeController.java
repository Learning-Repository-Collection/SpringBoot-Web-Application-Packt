package com.springbootlearning.learningspringboot3.ch2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    private final VideoService videoService;

    public HomeController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/react")
    public String react() {
        return "react";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("videos", videoService.getVideos());
        return "index";
    }

    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute Video newVideo) {
        videoService.create(newVideo);
        return "redirect:/";
    }


//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

}
