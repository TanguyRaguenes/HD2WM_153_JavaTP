package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.bo.Movie;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("sql")
@Component
public class DAOMovieSQL implements IDAOMovie{
    @Override
    public List<Movie> getMoviesList() {
        return List.of();
    }
}
