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

    public UserInfo(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
//other setters and getters
}
