package models.users;



import java.util.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("member")
@PrimaryKeyJoinColumn(referencedColumnName="email")
public class Member extends User{


    @Constraints.Required
    private Date dob;

    @Constraints.Required
    private String gender;


    @Constraints.Required
    private double height;

    @Constraints.Required
    private double weight;

    @Constraints.Required
    private double activityLevel;

    @Constraints.Required
    private String primaryGoal;

    @Constraints.Required
    private int noOfMeal;

    @Constraints.Required
    private double daily_kcal;

    public Member() {
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(double activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getPrimaryGoal() {
        return primaryGoal;
    }

    public void setPrimaryGoal(String primaryGoal) {
        this.primaryGoal = primaryGoal;
    }

    public int getNoOfMeal() {
        return noOfMeal;
    }

    public void setNoOfMeal(int noOfMeal) {
        this.noOfMeal = noOfMeal;
    }

    public double getDaily_kcal() {
        return daily_kcal;
    }

    public void setDaily_kcal(double daily_kcal) {
        this.daily_kcal = daily_kcal;
    }

    public double getMealCalories(){
        return daily_kcal/noOfMeal;
    }
}
