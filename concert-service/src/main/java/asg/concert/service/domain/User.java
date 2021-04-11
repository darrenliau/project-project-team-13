package asg.concert.service.domain;

public class User {

    private long id;
    private String username;
    private String password;
    private long version;

    public User() {}

    public User(long id, String username, String password, long version) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.version = version;
    }

}
