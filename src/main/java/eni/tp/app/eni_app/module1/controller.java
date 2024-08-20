package eni.tp.app.eni_app.module1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("home")
    public String getHomePage(){
        return "home-page";
    }

    @GetMapping("moviesList")
    public String getMoviesListPage(){
        return "movies-list-page";
    }

    @GetMapping("movieDetail")
    public String getMovieDetailPage(){
        return "movie-details-page";
    }
}
