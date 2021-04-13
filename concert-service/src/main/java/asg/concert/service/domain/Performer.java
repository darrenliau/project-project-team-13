package asg.concert.service.domain;

import asg.concert.common.types.Genre;

public class Performer {

    private long id;
    private String name;
    private String imageName;
    private Genre genre;
    private String blurb;

    public Performer(long id, String name, String imageName, Genre genre, String blurb) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.genre = genre;
        this.blurb = blurb;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageName() {
        return imageName;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getBlurb() {
        return blurb;
    }
}
