package models;

import java.util.*;
import javax.persistence.*;
import models.users.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

// Product Entity managed by the ORM
@Entity
public class Comment extends Model {

    // Properties
    // Annotate id as the primary key
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String content;

    @ManyToOne
    private Post p;

    // Default constructor
    public  Comment() {
    }

    // Constructor to initialise object
    public  Comment(Long id, String content, Post p) {
	   this.id = id;
        this.content = content;
        this.p = p;
        

    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Comment> find = new Finder<Long,Comment>(Comment.class);

    // Find all Comments in the database
    public static List<Comment> findAll() {
        return Comment.find.all();
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

    public void setPost(Post p){
	this.p = p;
    }

    public Post getPost(){
	    return p;
    }

	// might need to add user getters and setters later  

}
