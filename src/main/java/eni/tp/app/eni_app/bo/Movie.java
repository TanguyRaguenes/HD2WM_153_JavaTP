package eni.tp.app.eni_app.bo;

public class Movie {

    public long id;
    public String title;
    public int year;
    public int duration;
    public String synopsis;
    public String pathImg;

    public Movie(long id, String title, int year, int duration, String synopsis, String pathImg) {

        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
        this.pathImg = pathImg;


    }

}
