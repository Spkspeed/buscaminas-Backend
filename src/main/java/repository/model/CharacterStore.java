package repository.model;

import javax.persistence.*;

@Entity
public class CharacterStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    String user;

    @Lob
    String player;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
