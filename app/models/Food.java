package models;


import java.util.*;
import play.data.validation.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.Model;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "main")
public class Food {
    
    @Id
    private long foodId;

    @OneToMany
    private Meal m;

    @Constraints.Required
    private String foodName;

    @Constraints.Required
    private double kcal;
    
    @Constraints.Required
    private double protein;

    @Constraints.Required
    private double carbs;

    @Constraints.Required
    private double fat;



    public Food() {

    }

    public Food(Meal mIn) {
        m = mIn;
    }

    public Meal getMeal() {
        return m;
    }

    public void setMeal(Meal mIn) {
        m = mIn;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFat() {
        return fat;
    }

    public double getProtein() {
        return protein;
    }

    public double getKcal() {
        return kcal;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public long getFoodId() {
        return foodId;
    }
}
