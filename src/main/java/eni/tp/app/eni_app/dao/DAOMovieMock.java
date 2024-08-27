package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.bo.Movie;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Profile("mock")
@Component
public class DAOMovieMock implements IDAOMovie {

    List<Movie> movies = Arrays.asList(
            new Movie(0,"Furiosa",2024,120,"synopsis Furiosa", "furiosa.jpg"),
            new Movie(1,"Joker",2019,90,"synopsis Joker","joker.jpg"),
            new Movie(2,"300",2006,60,"synopsis 300","300.jpg")
    );




    @Override
    public List<Movie> getMoviesList() {
        return movies;
    }

    @Override
    public Movie getMovieById(int id) {
        Movie movie = movies.stream().filter(m->m.id==id).findFirst().orElse(null);
        return movie;
    }
}
