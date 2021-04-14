package asg.concert.service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "USERNAME", length = 50, nullable = false)
    private String username;

    @Column(name = "PASSWORD",length = 50, nullable = false)
    private String password;

    @Column(name = "VERSION", length = 50, nullable = false)
    private long version;

    public User() {}
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public User(long id, String username, String password, long version) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.version = version;
    }

    public long getId() {
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public long getVersion() {
        return version;
    }
}
