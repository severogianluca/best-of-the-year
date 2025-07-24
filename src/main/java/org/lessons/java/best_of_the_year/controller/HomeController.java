package org.lessons.java.best_of_the_year.controller;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Gianluca Severo");

        return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = getBestMovie();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/movies/{id}")
    public String getMovieById(@PathVariable("id") int movieId, Model model) {
        List<Movie> movies = getBestMovie();
        for (Movie movie : movies) {
            if (movie.getId() == movieId) {
                model.addAttribute(movie);
            }
        }
        return "movie";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        List<Song> songs = getBestSong();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/songs/{id}")
    public String getSongById(@PathVariable("id") int songId, Model model) {
        List<Song> songs = getBestSong();
        for (Song song : songs) {
            if (song.getId() == songId) {
                model.addAttribute(song);
            }
        }
        return "song";
    }

    // Lista di oggetti
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
