package com.springbootlearning.learningspringboot3.ch2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    public Video create(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }

    private List<Video> videos = List.of( //
            new Video("Need HELP with your SPRING BOOT 3 App?"),
            new Video("Don't do THIS to your own CODE!"),
            new Video("SECRETS to FIX "));

    public List<Video> getVideos() {
        return videos;

    }

}
