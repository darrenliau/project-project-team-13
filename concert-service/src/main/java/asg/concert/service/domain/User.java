package asg.concert.service.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue
    private long id;

    private String username;
    private String password;
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
