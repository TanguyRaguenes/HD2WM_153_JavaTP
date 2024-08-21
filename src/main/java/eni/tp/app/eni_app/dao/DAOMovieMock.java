package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.bo.Movie;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Profile("mock")
@Component
public class DAOMovieMock implements IDAOMovie {
    @Override
    public List<Movie> getMoviesList() {

        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(0,"Furiosa",2024,120,"synopsis Furiosa", "furiosa.jpg"));
        movies.add(new Movie(0,"Joker",2019,90,"synopsis Joker","joker.jpg"));
        movies.add(new Movie(0,"300",2006,60,"synopsis 300","300.jpg"));
        movies.add(new Movie(0,"Furiosa",2024,120,"synopsis Furiosa", "furiosa.jpg"));
        return movies;
    }
}
