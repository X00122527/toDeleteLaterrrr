package controllers;

import controllers.*;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import models.users.*;
import models.*;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    private FormFactory formFactory;


 private Environment env;



    @Inject
    public HomeController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(getUserFromSession()));
    }

    private Member getCurrentUser() {
        return (Member)User.getUserById(session().get("email"));
    }

   private User getUserFromSession(){
        return User.getUserById(session().get("email"));
    }

    public Result meals() {

        List<Meal> mealList = Meal.findAll();
	Form<Meal> mealForm = formFactory.form(Meal.class);
        return ok(meals.render(mealForm, getCurrentUser(), getUserFromSession(), mealList));
    }




	public Result editProfile(){
	return ok(editProfile.render(getUserFromSession()));
}

    @Security.Authenticated(Secured.class)
    public Result newsfeed() {
        List<Post> postsList = Post.findAll();
	    Form<Post> addPostForm = formFactory.form(Post.class);
        Form<Comment> addCommentForm = formFactory.form(Comment.class);
        List<Comment> commentsList = Comment.findAll();
        Post p = new Post();
	    return ok(newsfeed.render(addPostForm, addCommentForm, postsList, commentsList, getUserFromSession(), p));
    }


	//@Security.Authenticated(Secured.class)
   // public Result addPost(){
	//Form<Post> addPostForm = formFactory.form(Post.class);
	//return ok(addPost.render(addPostForm, getUserFromSession()));
     //}

    @Transactional
    public Result addPostSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form
        Form<Post> newPostForm = formFactory.form(Post.class).bindFromRequest();
        //getUserFromSession();
        //List<Post> postsList = Post.findAll();
        // Check for errors (based on Product class annotations)
        if(newPostForm.hasErrors()) {
            // Display the form again
            return redirect(controllers.routes.HomeController.newsfeed());
        }

        // Extract the postfrom the form object
        Post p = newPostForm.get();
        p.setUser(getUserFromSession());
        p.save();

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Your Post was added to the newsfeed.");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.newsfeed());
    }

      @Transactional
    public Result addCommentSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Comment> newCommentForm = formFactory.form(Comment.class).bindFromRequest();
        List<Comment> commentsList = Comment.findAll();

        // Check for errors (based on Product class annotations)
        if(newCommentForm.hasErrors()) {
            // Display the form again
            return redirect(controllers.routes.HomeController.newsfeed());
        }

        // Extract the product from the form object
        Comment c = newCommentForm.get();


        if (c.getId() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            c.save();
        }
        // Product already exists so update
        else if (c.getId() != null) {
            c.update();
        }

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Your Comment was added to the newsfeed.");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.newsfeed());
    }


    
 @Transactional
    public Result addMealSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form
        Form<Meal> newMealForm = formFactory.form(Meal.class).bindFromRequest();
        //getUserFromSession();
        //List<Post> postsList = Post.findAll();
        // Check for errors (based on Product class annotations)
        if(newMealForm.hasErrors()) {
            // Display the form again
            return redirect(controllers.routes.HomeController.newsfeed());
        }

        // Extract the postfrom the form object
        Meal m = newMealForm.get();
        m.setUser(getCurrentUser());
        m.save();

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Your Post was added to the newsfeed.");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.newsfeed());
    }


    

}
