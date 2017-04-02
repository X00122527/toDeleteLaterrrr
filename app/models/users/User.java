package models.users;

import java.util.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


// User Entity
@Entity

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "role")
public class User extends Model {
    
    @Id
    private String email;


    @Constraints.Required
    private String name;

    @Constraints.Required
    private String surname;

    @Constraints.Required
    @OneToMany (mappedBy = "u")
    private List<Post> posts;


    @Constraints.Required
    private String password;

    public User() {

    }

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public static List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        return find.where().eq("email", email).eq("password", password).findUnique();
    }


    public static User getUserById(String id){
        if (id == null)
            return null;
        else
            return find.byId(id);
    }

    public String getEmail() {
        return email;
    }


    /*public String getRole() {
        return role;
    }*/

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String emailIn) {
        email = emailIn;
    } 

    public void setName(String nameIn) {
        name = nameIn;
    }

    public void setSurname(String surnameIn) {
        surname = surnameIn;
    }

    public void setPassword(String passwordIn) {
        password = passwordIn;
    }

    /*public void setRole(String roleIn) {
        role = roleIn;
    }*/

	public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


}
