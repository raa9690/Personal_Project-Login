package main.java.com.project_backend.userData.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "user_data")
public class UserInfo {
    private int id;
    private String username;
    private String password;

    public UserInfo() {
    }

    // currently no form of encryption for the password
    public UserInfo(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    // currently no use for this right now, though might be useful for changing account info
    public void setUsername(String username){
        this.username = username;
    }
    // currently no use for this right now, though might be useful for changing account info
    public void setPassword(String password) {
        this.password = password;
    }
}
