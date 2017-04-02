package models;

import java.util.*;
import javax.persistence.*;
import models.users.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

// Product Entity managed by the ORM
@Entity
public class Post extends Model {

    // Properties
    // Annotate id as the primary key
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String content;
    

    @ManyToOne
    private User u;

    private int likes;


    @OneToMany(mappedBy="p")
    private List<Comment> comments;

    // Default constructor
    public  Post() {
    }

    public Post(User u) {
        this.u = u;
    }

    // Constructor to initialise object
    public  Post(Long id, String content, User u) {
	   this.id = id;
        this.content = content;
        this.u = u;
        likes = 0;

    }


    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Post> find = new Finder<Long,Post>(Post.class);

    // Find all Posts in the database
    public static List<Post> findAll() {
        return Post.find.all();
    }

    public void giveLike() {
        likes++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(User user){
	u = user;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public User getUser(){
	    return u;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    // might need to add user getters and setters later

}
