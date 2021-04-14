package asg.concert.service.domain;

import asg.concert.common.types.Genre;

import javax.persistence.*;

@Entity
public class Performer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "IMAGE_NAME", length = 50, nullable = false)
    private String imageName;

    @Enumerated(EnumType.STRING)
    @Column(name = "GENRE", length = 50, nullable = false)
    private Genre genre;

    @Column(name = "BLURB", length = 50, nullable = false)
    private String blurb;

    public Performer(long id, String name, String imageName, Genre genre, String blurb) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.genre = genre;
        this.blurb = blurb;
    }

    public Performer() {

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
