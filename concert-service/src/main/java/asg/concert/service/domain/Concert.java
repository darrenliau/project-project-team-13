package asg.concert.service.domain;

import java.time.LocalDateTime;
import java.util.*;

import javax.persistence.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Concert {

    private Long id;
    private String title;
    private String imageName;
    private String blurb;

    //do we need dates/performers?
    private List<LocalDateTime> dates = new ArrayList<>();
    private List<Performer> performers = new ArrayList<>();

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
        return null;
    }
}
