package asg.concert.service.domain;

import java.time.LocalDateTime;
import java.util.*;

import javax.persistence.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jboss.resteasy.spi.touri.MappedBy;

@Entity
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE",length = 50, nullable = false)
    private String title;

    @Column(name = "IMAGE_NAME", length = 50, nullable = false)
    private String imageName;

    @Column(name = "BLURB", length = 50, nullable = false)
    private String blurb;

    @ElementCollection
    private Set<LocalDateTime> dates = new HashSet<>();;

    @OneToMany
    private Set<Performer> performers = new HashSet<>();;

    public Concert() {}

    public Concert(Long id, String title, String imageName, String blurb) {
        this.id = id;
        this.title = title;
        this.imageName = imageName;
        this.blurb = blurb;
    }

    public long getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getImageName(){
        return imageName;
    }
    public String getBlurb(){
        return blurb;
    }

    public Set<LocalDateTime> getDates() {
        return dates;
    }
    public Set<Performer> getPerformers(){
        return performers;
    }
}
