package asg.concert.service.domain;

public class Performer {

    private long id;
    private String name;
    private String imageName;
    private String genre;
    private String blurb;

    public Performer(long id, String name, String imageName, String genre, String blurb) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.genre = genre;
        this.blurb = blurb;
    }

}
