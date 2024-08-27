package eni.tp.app.eni_app.controller;


import eni.tp.app.eni_app.bll.MovieManager;
import eni.tp.app.eni_app.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
//Récupérer user dans la session
@SessionAttributes({"loggedUser"})
public class AppController {

    @Autowired
    MovieManager movieManager;

    @GetMapping("home")
    public String getHomePage(){
        return "home-page";
    }

    @GetMapping("moviesList")
    public String getMoviesListPage(Model model){
//        Spring sait qu'on renvoi une URL et va automatiquement injecter le model dedans
        model.addAttribute("movies", movieManager.selectMovies());

        List<Integer> maxStars = Arrays.asList(1,2,3,4,5);
        model.addAttribute("maxStars", maxStars);

        return "movies-list-page";

    }

    @GetMapping("movieDetails/{id}")
    public String getMovieDetailPage(@PathVariable  ("id") int id, Model model){
        Movie movie = movieManager.selectMovieById(id);

        if(movie == null){
            return "movie-not-found";
        }

        model.addAttribute("movie", movie);

        List<Integer> maxStars = Arrays.asList(1,2,3,4,5);
        model.addAttribute("maxStars", maxStars);

        return "movie-details-page";
    }
}
