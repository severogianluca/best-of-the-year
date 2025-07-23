package org.lessons.java.best_of_the_year.controller;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Gianluca Severo");

        List<Movie> movies = getBestMovie();
        model.addAttribute("movies", movies);

        List<Song> songs = getBestSong();
        model.addAttribute("songs", songs);
        
        return "home";
    }

    private List<Movie> getBestMovie() {
        List<Movie> listMovie = new ArrayList<>();

        listMovie.add(new Movie(1, "Il padrino", 434));
        listMovie.add(new Movie(2, "Scarface", 170));
        listMovie.add(new Movie(3, "Arancia Meccanica", 137));

        return listMovie;

    }

    private List<Song> getBestSong() {
        List<Song> listSong = new ArrayList<>();

        listSong.add(new Song(1, "Changes", "2PAC"));
        listSong.add(new Song(2, "In da Club", "50Cent"));
        listSong.add(new Song(3, "Drop it like it's hot", "Snoop Dog"));

        return listSong;

    }
}
