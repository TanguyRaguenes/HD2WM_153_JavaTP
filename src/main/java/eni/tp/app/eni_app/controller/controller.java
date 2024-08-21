package eni.tp.app.eni_app.controller;


import eni.tp.app.eni_app.bll.MovieManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @Autowired
    MovieManager movieManager;

    @GetMapping("home")
    public String getHomePage(){
        return "home-page";
    }

    @GetMapping("moviesList")
    public String getMoviesListPage(Model model){
//        Spring sait qu'on renvoi une URL et va automatiquement injecter le model dedans
        model.addAttribute("films", movieManager.selectMovies());
        return "movies-list-page";

    }

    @GetMapping("movieDetail")
    public String getMovieDetailPage(){
        return "movie-details-page";
    }
}
