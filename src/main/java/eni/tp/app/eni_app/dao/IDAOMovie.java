package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.bo.Movie;

import java.util.List;

public interface IDAOMovie {

    public abstract List<Movie> getMoviesList();
    public abstract Movie getMovieById(int id);
}
