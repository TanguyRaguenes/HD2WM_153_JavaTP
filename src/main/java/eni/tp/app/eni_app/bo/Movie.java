package eni.tp.app.eni_app.bo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Movie {

    public long id;

    @NotBlank(message="Le titre doit-être renseigné !")
    public String title;

    @NotNull(message="L'année est obligatoire !")
    @Min(value=1895, message="Veuillez saisir une année cohérente")
    public int year;

    @NotNull(message="La durée est obligatoire !")
    @Min(value=1, message="Veuillez saisir une durée cohérente")
    public int duration;

    @NotBlank(message="Le synopsis doit-être renseigné !")
    public String synopsis;
    @NotBlank(message="L'adresse de l'image doit-être renseignée !")
    public String pathImg;

    public int note;

    public Movie(){
        super();
    }

    public Movie(long id, String title, int year, int duration, String synopsis, String pathImg) {

        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
        this.pathImg = pathImg;
//        this.note = note;


    }

    public int getNote() {
        return note;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", duration=" + duration
                + ", synopsis=" + synopsis + ", pathImg=" + pathImg + "]";

    }
}
